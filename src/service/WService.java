package service;

/**
 * Created by Florian on 18/12/2016.
 */

import java.util.ArrayList;
import java.util.List;


import javax.ws.rs.*;
import com.google.gson.Gson;


import meserreurs.MonException;
import metier.*;
import persistance.DialogueBd;

    @Path("/mediatheque")
    public class WService {
       // ACTEURS //

        @GET
        @Path("/Acteurs")
        @Produces("application/json")
        public String rechercheLesAdherents() throws MonException {
            List<Object> rs;
            List<Acteur> mesActeurs = new ArrayList<Acteur>();
            int index = 0;
            try {
                DialogueBd unDialogueBd = DialogueBd.getInstance();
                String mysql = "";

                mysql = "SELECT * FROM acteur ORDER BY NoAct ASC";

                rs = unDialogueBd.lecture(mysql);

                while (index < rs.size()) {

                    // On cr�e un objet Adherent
                    Acteur unAdh = new Acteur();
                    unAdh.setNoAct(Integer.parseInt(rs.get(index + 0).toString()));
                    unAdh.setNomAct(rs.get(index + 1).toString());
                    unAdh.setPrenAct(rs.get(index + 2).toString());
                    unAdh.setDateNaiss(rs.get(index + 3).toString());
                    if (rs.get(index + 4) != null ) {
                    unAdh.setDateDeces(rs.get(index+ 4).toString());

                    }
                    index = index + 5;




                    mesActeurs.add(unAdh);
                }

                Gson gson = new Gson();
                String json = gson.toJson(mesActeurs);
                return json;

            } catch (MonException e) {
                System.out.println(e.getMessage());
                throw e;
            }
        }


        @GET
        @Path("/Categories")
        @Produces("application/json")
        public String getAllCategories() throws MonException{
            List<Object> rs;
            List<Categorie> mesCate = new ArrayList<Categorie>();
            int index = 0;

            try {
                DialogueBd unDialogueBd = DialogueBd.getInstance();
                String mysql = "";

                mysql = "SELECT * FROM Categorie " ;

                rs = unDialogueBd.lecture(mysql);

                while (index < rs.size()){
                    Categorie obj = new Categorie(rs.get(index).toString(), rs.get(index + 1 ).toString());
                    mesCate.add(obj);
                    index = index + 2 ;
                }
            } catch (MonException e) {
            System.out.println(e.getMessage());
            throw e;
        }
            Gson gson = new Gson();
            String json = gson.toJson(mesCate);
            return json;
        }


        // FILMS //

        @GET
        @Path("/Films")
        @Produces("application/json")
        public String getAllFilm() throws MonException{
            List<Object> rs;
            List<Film> mesFilms = new ArrayList<Film>();
            int i = 0;

            try{
                DialogueBd dialogueBd = DialogueBd.getInstance();

                String mysql = "SELECT * FROM film";
                rs = dialogueBd.lecture(mysql);

                while(i < rs.size()){
                    Film f = new Film(Integer.parseInt(rs.get(i).toString()),
                            rs.get(i +1).toString(),
                            Integer.parseInt(rs.get(i+2).toString()),
                            rs.get(i+3).toString(),
                            Long.parseLong(rs.get(i+4).toString()),
                            Long.parseLong(rs.get(i+5).toString()),
                            Integer.parseInt(rs.get(i+6).toString()),
                            rs.get(i+7).toString());
                    mesFilms.add(f);
                    i = i + 8;


                }
                Gson gson = new Gson();
                String json = gson.toJson(mesFilms);
                return json;

            } catch (MonException e) {
                System.out.println(e.getMessage());
                throw e;
            }
        }

        @GET
        @Path("/Films/{Id}")
        @Produces("application/json")
        public String rechercherOeuvreId(@PathParam("Id") String idFilm) throws MonException, Exception
        {
            String mysql="";
            String json = "";
            Film unFilm;
            try{
                mysql ="SELECT * FROM Film Where NoFilm = " + idFilm + ";";
                unFilm = rechercheFilm(mysql);
                Gson gson = new Gson();
                json = gson.toJson(unFilm);
            }
            catch (MonException e) {
                System.out.println(e.getMessage());
                throw e;
            }
            return json;
        }

        public Film rechercheFilm(String mysql) throws MonException {


            List<Object> rs;
            DialogueBd dialogueBd = DialogueBd.getInstance();
            rs = dialogueBd.lecture(mysql);
            int i = 0;
            Film film = null;
            if(rs.size()>0){
                 film = new Film(Integer.parseInt(rs.get(i).toString()),
                        rs.get(i +1).toString(),
                        Integer.parseInt(rs.get(i+2).toString()),
                        rs.get(i+3).toString(),
                        Long.parseLong(rs.get(i+4).toString()),
                        Long.parseLong(rs.get(i+5).toString()),
                        Integer.parseInt(rs.get(i+6).toString()),
                        rs.get(i+7).toString());



            }

            return film;

        }


        // PERSONNAGE //

        @GET
        @Path("/Personnages")
        @Produces("application/json")
        public String getAllPersonnage() throws MonException{
            List<Object> rs;
            List<Personnage> mesPerso = new ArrayList<Personnage>();
            int index = 0;
            try{
                DialogueBd unDialoguebd = DialogueBd.getInstance();
                String mysql = "SELECT * from Personnage";
                rs = unDialoguebd.lecture(mysql);

                while(index < rs.size()) {
                    Personnage p = new Personnage(
                            Integer.parseInt(rs.get(index).toString()),
                            Integer.parseInt(rs.get(index + 1 ).toString()),
                            rs.get(index + 2 ).toString()
                    );

                    mesPerso.add(p);
                    index = index + 3 ;
                }


            Gson gson = new Gson();
            String json = gson.toJson(mesPerso);
            return json;

        } catch (MonException e) {
            System.out.println(e.getMessage());
            throw e;
        }


        }

        // REALISATEURS //

        @GET
        @Path("/Realisateurs")
        @Produces("application/json")
        public String getAllRealisateur() throws MonException{
            List<Object> rs;
            List<Realisateur> mesRea = new ArrayList<Realisateur>();
            int index = 0;

            try{
                DialogueBd unDialoguebd = DialogueBd.getInstance();
                String mysql = "SELECT * from Personnage";
                rs = unDialoguebd.lecture(mysql);

                while(index < rs.size()) {
                    Realisateur r = new Realisateur(
                            Integer.parseInt(rs.get(index).toString()),
                            rs.get(index +1 ).toString(),
                            rs.get(index +2).toString()
                    );

                    index = index + 3;
                    mesRea.add(r);
                }



                Gson gson = new Gson();
                String json = gson.toJson(mesRea);
                return json;

            } catch (MonException e) {
                System.out.println(e.getMessage());
                throw e;
            }
        }


}

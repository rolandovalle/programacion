/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template ufile, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEVMOBILE
 */
    public static class Persona{
        
        abstract String getNombre();
        

    }



    public static class Deportista extends Persona{

     
        public String getNombre() {
            return "Carlos";
        }

   

    }


    public static class Estudiante extends Persona{

     
          public String getNombre() {
            return "Pedro";
        }



    }




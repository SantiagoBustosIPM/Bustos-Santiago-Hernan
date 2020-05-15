package com.company;
    public class Huesped {
        private String Nombre;
        private String Apellido;
        private int Edad;
        private int Dni;
        private int CantidaddeVisitas;

        /*
        los nombres de los atributos deben comenzar
        con letras minúsculas
         */
        public Huesped (String Nombre, String Apellido, int Edad, int Dni){
            this.Nombre = Nombre;
            this.Apellido = Apellido;
            this.Edad = Edad;
            this.Dni = Dni;
            this.CantidaddeVisitas = 0;
            }

        public String getNombre() {
        return Nombre;
    }
        public String getApellido() {
        return Apellido;
    }
        public int getDni() {
        return Dni;
    }
        public int getEdad() {
        return Edad;
    }
        public int getCantidaddeVisitas() {
        return CantidaddeVisitas;
    }
        public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
        public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
        public void setDni(int Dni) {
        this.Dni = Dni;
    }
        public void setEdad(int Edad) {
        this.Edad = Edad;
    }
        public void setCantidaddeVisitas(int CantidaddeVisitas) {
        this.CantidaddeVisitas = CantidaddeVisitas;
    }

    /*
    bien!

    recordar indentar correctamente.
     */
    }

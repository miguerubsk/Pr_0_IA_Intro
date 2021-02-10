/*
 * Copyright (C) 2021 Miguel González García
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package practica0;

import java.util.Scanner;

/**
 *
 * @author Miguel González García
 */
public class Alumno {
    protected String nombre, apellido, email;
    protected int dni;
    protected final Scanner reader = new Scanner(System.in);

    public Alumno(String nombre, String apellido, int dni, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
    }

    public Alumno() {
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        this.email = "";
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", email=" + email + '}';
    }
    
    public void crearAlumno(){
        System.out.println("Nombre: ");
        this.nombre = reader.next();
        System.out.println("Apellidos: ");
        this.apellido = reader.next();
        System.out.println("DNI: ");
        this.dni = reader.nextInt();
        System.out.println("E-Mail: ");
        this.email = reader.next();
    }
    
    public void mostrarAlumno(){
        System.out.println(this);
    }

}

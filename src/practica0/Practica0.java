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

import Ficheros.LeerFichero;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel González García
 */
public class Practica0 {

    private final static Scanner reader = new Scanner(System.in);

    public static Alumno crearAlumno() {
        System.out.println("Nombre: ");
        String nombre = reader.next();
        System.out.println("Apellido: ");
        String apellido = reader.next();
        System.out.println("DNI: ");
        int dni = reader.nextInt();
        System.out.println("E-Mail: ");
        String email = reader.next();
        return new Alumno(nombre, apellido, dni, email);
    }

    public static ArrayList<Alumno_IA> buscarImpares(ArrayList<Alumno_IA> alumnos) {
        ArrayList<Alumno_IA> aux = new ArrayList<>();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getDni() % 2 != 0) {
                aux.add(alumnos.get(i));
            }
        }
        return aux;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno_IA> alumnos = new ArrayList<>();
        ArrayList<Alumno_IA> impares;
        try {
            LeerFichero datos = new LeerFichero("datos.txt");
            for (int i = 0; i < datos.getNumAlumnos(); i++) {
                alumnos.add(new Alumno_IA(i, datos.getAlumno(i)));
                System.out.println(datos.getAlumno(i) + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(Practica0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

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
package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import practica0.Alumno;

/**
 *
 * @author Miguel González García
 */
public class LeerFichero {

    private ArrayList<Alumno> alumnos;
    private EscribirFichero escribir;

    public LeerFichero(String fichero) throws IOException {
        alumnos = new ArrayList<>();
        escribir = new EscribirFichero("impares.txt");
        FileReader f = null;
        String linea;
        try {
            f = new FileReader(fichero);
            BufferedReader b = new BufferedReader(f);
            while ((linea = b.readLine()) != null) {
                String[] split = linea.split(", ");
                String[] na = split[0].split(" ");
                alumnos.add(new Alumno(na[0], na[1], Integer.parseInt(split[1]), split[2]));
                if(Integer.parseInt(split[1]) %2 != 0){
                    escribir.escribirLinea(linea);
                }
            }
            escribir.cerrarFichero();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public Alumno getAlumno(int index) {
        return alumnos.get(index);
    }

    public int getNumAlumnos() {
        return alumnos.size();
    }
}

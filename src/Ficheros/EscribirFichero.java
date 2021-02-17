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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Miguel González García
 */
public class EscribirFichero {
    
    private FileWriter fichero = null;
    private PrintWriter pw = null;
    
    public EscribirFichero(String nombre) throws IOException {
        File archivo = new File(nombre);
        if (!archivo.exists()) {
            archivo.createNewFile();
        } else {
            archivo.delete();
            archivo.createNewFile();
        }
        fichero = new FileWriter(archivo);
        pw = new PrintWriter(fichero);
    }
    
    public void escribirLinea(String linea) throws IOException {
        fichero.write(linea + "\n");
    }
    
    public void cerrarFichero() throws IOException{
        fichero.close();
    }
    
}

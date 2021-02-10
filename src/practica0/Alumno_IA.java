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

/**
 *
 * @author Miguel González García
 */
public class Alumno_IA extends Alumno{
    private int GrupoPracticas, NotaPracticas;

    public Alumno_IA(int GrupoPracticas, String nombre, String apellido, int dni, String email) {
        super(nombre, apellido, dni, email);
        this.GrupoPracticas = GrupoPracticas;
    }

    public Alumno_IA() {
    }
    
    public void CalcularNotaPracticas(){
        int aux = 0;
        for(int i = 0; i < 4; i++){
            System.out.println("Nota " + (i+1) + ": ");
            aux += this.reader.nextInt();
        }
        this.NotaPracticas = aux/4;
    }

    @Override
    public String toString() {
        return "Alumno_IA{"+ "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", email=" + email + ", GrupoPracticas=" + GrupoPracticas + ", NotaPracticas=" + NotaPracticas + '}';
    }
    
    

}

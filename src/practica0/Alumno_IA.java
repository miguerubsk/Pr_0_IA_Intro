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
public class Alumno_IA extends Alumno{
    private int grupoPracticas;
    private double notaPracticas;
    private final Scanner reader = new Scanner(System.in);

    public Alumno_IA(int GrupoPracticas, String nombre, String apellido, int dni, String email) {
        super(nombre, apellido, dni, email);
        this.grupoPracticas = GrupoPracticas;
    }
    
    public Alumno_IA(int GrupoPracticas, Alumno alumno) {
        super(alumno.getNombre(), alumno.getApellido(), alumno.getDni(), alumno.getEmail());
        this.grupoPracticas = GrupoPracticas;
    }

    public Alumno_IA() {
        super();
        this.grupoPracticas = -1;
        this.notaPracticas = -1;
    }
    
    public void CalcularNotaPracticas(){
        int aux = 0;
        for(int i = 0; i < 4; i++){
            System.out.println("Nota " + (i+1) + ": ");
            aux += this.reader.nextDouble();
        }
        this.notaPracticas = aux/4;
    }
    
    public void CalcularNotaPracticas(double nota1, double nota2, double nota3, double nota4){
        this.notaPracticas = (nota1+nota2+nota3+nota4)/4;
    }

    @Override
    public String toString() {
        return "Alumno_IA{"+ "nombre=" + super.getNombre() + ", apellido=" + super.getApellido() + ", dni=" + super.getDni() + ", email=" + super.getEmail() + ", GrupoPracticas=" + grupoPracticas + ", NotaPracticas=" + notaPracticas + '}';
    }
    
//    public
}

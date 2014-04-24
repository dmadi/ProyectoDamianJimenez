/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoFinal;

import java.io.Serializable;

/**
 *
 * @author Damian
 */
public class Dato implements Serializable {
int numero;
String pregunta;
String respuestaC;
String respuestaI; 
String respuestaI2;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaC() {
        return respuestaC;
    }

    public void setRespuestaC(String respuestaC) {
        this.respuestaC = respuestaC;
    }

    public String getRespuestaI() {
        return respuestaI;
    }

    public void setRespuestaI(String respuestaI) {
        this.respuestaI = respuestaI;
    }

    public String getRespuestaI2() {
        return respuestaI2;
    }

    public void setRespuestaI2(String respuestaI2) {
        this.respuestaI2 = respuestaI2;
    }
    
    @Override
    public String toString() {
        return "Dato (" + "numero=" + numero + ", pregunta=" + pregunta + ", respuesta1=" + respuestaC+ ", respuesta2=" + respuestaI+ ", respuesta3=" + respuestaI2 + ')';
    }
    public Dato(int numero, String pregunta, String respuestaC, String respuestaI, String respuestaI2) {
        this.numero = numero;
        this.pregunta = pregunta;
        this.respuestaC = respuestaC;
        this.respuestaI = respuestaI;
        this.respuestaI2 = respuestaI2;
    }
}

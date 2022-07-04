package com.api_codigo_morse.api_codigo_morse.Model;

public class MorseTraduzido {
    private String texto;

    public MorseTraduzido(String morse){
        this.texto = traduzMorse(morse);
    }

    public String getTexto() {
        return texto;
    }

    public String traduzMorse(String morse){
        String texto = "";
        morse = morse.replace("   ", " @ ");
        String[] morseSplitted = morse.split(" ");
        for(String m:morseSplitted){
            switch (m){
                case ".-":
                    texto += "A";
                    break;
                case "-...":
                    texto += "B";
                    break;
                case "-.-.":
                    texto += "C";
                    break;
                case "-..":
                    texto += "D";
                    break;
                case ".":
                    texto += "E";
                    break;
                case "..-.":
                    texto += "F";
                    break;
                case "--.":
                    texto += "G";
                    break;
                case "....":
                    texto += "H";
                    break;
                case "..":
                    texto += "I";
                    break;
                case ".---":
                    texto += "J";
                    break;
                case "-.-":
                    texto += "K";
                    break;
                case ".-..":
                    texto += "L";
                    break;
                case "--":
                    texto += "M";
                    break;
                case "-.":
                    texto += "N";
                    break;
                case "---":
                    texto += "O";
                    break;
                case ".--.":
                    texto += "P";
                    break;
                case "--.-":
                    texto += "Q";
                    break;
                case ".-.":
                    texto += "R";
                    break;
                case "...":
                    texto += "S";
                    break;
                case "-":
                    texto += "T";
                    break;
                case "..-":
                    texto += "U";
                    break;
                case "...-":
                    texto += "V";
                    break;
                case ".--":
                    texto += "W";
                    break;
                case "-..-":
                    texto += "X";
                    break;
                case "-.--":
                    texto += "Y";
                    break;
                case "--..":
                    texto += "Z";
                    break;
                case ".----":
                    texto += "1";
                    break;
                case "..---":
                    texto += "2";
                    break;
                case "...--":
                    texto += "3";
                    break;
                case "....-":
                    texto += "4";
                    break;
                case ".....":
                    texto += "5";
                    break;
                case "-....":
                    texto += "6";
                    break;
                case "--...":
                    texto += "7";
                    break;
                case "---..":
                    texto += "8";
                    break;
                case "----.":
                    texto += "9";
                    break;
                case "-----":
                    texto += "0";
                    break;
                case "..--..":
                    texto += "?";
                case "-.-.--":
                    texto += "!";
                    break;
                case ".-.-.-":
                    texto += ".";
                    break;
                case "--..--":
                    texto += ",";
                    break;
                case "@":
                    texto += " ";
                    break;
            }
        }
        return texto;
    }
}

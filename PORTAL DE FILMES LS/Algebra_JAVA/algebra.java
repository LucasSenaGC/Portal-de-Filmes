class algebra{
    public static boolean isZero(String s){
        boolean zero = false;
        if(s == "0"){
            zero = true;
        }
        return zero;
    }


    public static String tirarEspaco(String s){
        String aux = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                aux = aux + s.charAt(i);
            }            
        }
        return aux;
    }
        
    public static String trocarLetras(String s){
        char A, B, C;
        String aux = "";
        if(s.charAt(0) == '2'){
            A = s.charAt(1);
            B = s.charAt(2); 
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == 'A'){
                    aux = aux + A;
                }else if(s. charAt(i) == 'B'){
                    aux = aux + B;
                }else if(i > 2){
                    aux = aux + s.charAt(i);
                }
            }                 
        }else if(s.charAt(0) == '3'){
            A = s.charAt(1);
            B = s.charAt(2);
            C = s.charAt(3); 
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == 'A'){
                    aux = aux + A;
                }else if(s. charAt(i) == 'B'){
                    aux = aux + B;
                }else if(s.charAt(i) == 'C'){
                    aux = aux + C;
                }else if(i > 3){
                    aux = aux + s.charAt(i);
                }
            }          
        }
        return aux;
    }

    public static String operacaoLogica(String s){
        String aux = "";
        int i = 0; 
       // while(j != 1){
            //for(int i = 0; i < s.length(); i++){
                
        while(i < s.length()){
                //not(0)
                if(s.charAt(i) == 'n' && s.charAt(i+1) == 'o' && s.charAt(i + 2) == 't' && s.charAt(i+3) == '(' && s.charAt(i + 4) == '0' && s.charAt(i + 5) == ')'){
                    aux = aux + '1';
                    i += 5;
                //not(1)
                }else if(s.charAt(i) == 'n' && s.charAt(i+1) == 'o' && s.charAt(i + 2) == 't' && s.charAt(i+3) == '(' && s.charAt(i + 4) == '1' && s.charAt(i + 5) == ')'){
                    aux = aux + '0';
                    i += 5;
                }else{
                    //and
                    //qualquer valor que conter um 0 a operacao and vai dar 0
                    //para dois valores dentro do and(x,x)
                    if(s.charAt(i) == 'a' && s.charAt(i+4) == '0' && s.charAt(i+7) == ')' || s.charAt(i) == 'a' && s.charAt(i+6) == '0' && s.charAt(i+7) == ')'){
                        aux = aux + '0';
                        i += 7;
                    //quando vale 1 -> and(1,1) 
                    }else if(s.charAt(i) == 'a' && s.charAt(i+4) == '1' && s.charAt(i+6) == '1' && s.charAt(i+7) == ')'){
                        aux = aux + '1';
                        i += 7;
                    //para tres valores dentro do and(x,x,x)
                    }else if(s.charAt(i) == 'a'  && s.charAt(i+4) == '0' && s.charAt(i+9) == ')' || s.charAt(i) == 'a' && s.charAt(i+6) == '0' && s.charAt(i+9) == ')' || s.charAt(i) == 'a' && s.charAt(i+8) == '0' && s.charAt(i+9) == ')' ){
                        aux = aux + '0';
                        i += 9;
                    //quando vale 1 -> and(1,1,1)
                    }else if(s.charAt(i) == 'a'  && s.charAt(i+4) == '1' && s.charAt(i+6) == '1' && s.charAt(i+8) == '1' && s.charAt(i+9) == ')'){
                        aux = aux + '1';
                        i += 9;
                    //para quatro valores dentro do and(x,x,x,x)
                    }else if(s.charAt(i) == 'a' && s.charAt(i+4) == '0' && s.charAt(i+11) == ')' || s.charAt(i) == 'a' && s.charAt(i+6) == '0' && s.charAt(i+11) == ')' || s.charAt(i) == 'a' && s.charAt(i+8) == '0' && s.charAt(i+11) == ')' ||
                    s.charAt(i) == 'a' && s.charAt(i+10) == '0' && s.charAt(i+11) == ')'){
                        aux = aux + '0';
                        i += 11;
                    //quando vale 1 -> and(1,1,1,1)
                    }else if(s.charAt(i) == 'a' && s.charAt(i+4) == '1' && s.charAt(i+6) == '1' && s.charAt(i+8) == '1' && s.charAt(i+10) == '1' && s.charAt(i+11) == ')' ){
                        aux = aux + '1';
                        i += 11;
                    //para cinco valores dentro do and(x,x,x,x,x)
                    }else if(s.charAt(i) == 'a' && s.charAt(i+4) == '0' && s.charAt(i+13) == ')' ||  s.charAt(i) == 'a' && s.charAt(i+6) == '0' && s.charAt(i+13) == ')' || s.charAt(i) == 'a' && s.charAt(i+8) == '0' && s.charAt(i+13) == ')' ||
                    s.charAt(i) == 'a' && s.charAt(i+10) == '0' && s.charAt(i+13) == ')' ||  s.charAt(i) == 'a' && s.charAt(i+12) == '0' && s.charAt(i+13) == ')'){
                        aux = aux + '0';
                        i += 13;
                    //quando vale 1 -> and(1,1,1,1,1)
                    }else if(s.charAt(i) == 'a' && s.charAt(i+4) == '1' && s.charAt(i+6) == '1' && s.charAt(i+8) == '1' && s.charAt(i+10) == '1' && s.charAt(i+12) == '1' && s.charAt(i+13) == ')'){
                        aux = aux + '1';
                        i += 13;
                    //para qualquer valor valendo 1 a resposta eh 1
                    //para dois valores dentro do or(x,x)
                    }else if(s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+3) == '1' && s.charAt(i+6) == ')' || s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+5) == '1' && s.charAt(i+6) == ')' ){
                        aux = aux + '1';
                        i += 6;
                    //quando vale 0 -> or(0,0)
                    }else if(s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+3) == '0' && s.charAt(i+5) == '0' && s.charAt(i+6) == ')'){
                        aux = aux + '0';
                        i += 6;
                    //para tres valores dentro do or(x,x,x)
                    }else if(s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+3) == '1' && s.charAt(i+8) == ')' || s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+5) == '1' && s.charAt(i+8) == ')' ||
                    s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+6) == '1' && s.charAt(i+8) == ')'){
                        aux = aux + '1';
                        i += 8;
                    //quando vale 0 -> or(0,0,0)
                    }else if(s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+3) == '0'  && s.charAt(i+5) == '0'  && s.charAt(i+7) == '0' && s.charAt(i+8) == ')' ){
                        aux = aux + '0';
                        i += 8;
                    //para quatro valores dentro do or(x,x,x,x)
                    }else if(s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+3) == '1' && s.charAt(i+10) == ')' || s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+5) == '1' && s.charAt(i+10) == ')' || 
                    s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+7) == '1' && s.charAt(i+10) == ')' || s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+9) == '1' && s.charAt(i+10) == ')' ){
                        aux = aux + '1';
                        i += 10;
                    //quando vale 0 -> or(0,0,0,0)
                    }else if(s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+3) == '0' && s.charAt(i+5) == '0' && s.charAt(i+7) == '0' && s.charAt(i+9) == '0' && s.charAt(i+10) == ')'){
                        aux = aux + '0';
                        i += 10;
                    //para cinco valores dentro do or(x,x,x,x,x)
                    }else if(s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+3) == '1' && s.charAt(i+12) == ')' || s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+5) == '1' && s.charAt(i+12) == ')' ||
                    s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+7) == '1' && s.charAt(i+12) == ')' || s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+9) == '1' && s.charAt(i+12) == ')' || 
                    s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+11) == '1' && s.charAt(i+12) == ')'){
                        aux = aux + '1';
                        i += 12;
                    //quando vale 0 -> or(0,0,0,0,0)
                    }else if(s.charAt(i) == 'o' && s.charAt(i+1) == 'r' && s.charAt(i+3) == '0' && s.charAt(i+5) == '0' && s.charAt(i+7) == '0' && s.charAt(i+9) == '0' && s.charAt(i+11) == '0' && s.charAt(i+12) == ')'){
                        aux = aux + '0';
                        i += 12;
                    }else{
                        aux = aux + s.charAt(i);
                    }
                    i++;
                    MyIO.println(aux);
                }
        }
        return aux;
    }





    public static void main(String[] args){
        String s;
        do{
            s = MyIO.readLine();
            s = tirarEspaco(s);
            s = trocarLetras(s);
            do{
                s = operacaoLogica(s);
            }while(s.charAt(0) != '0' && s.charAt(0) != '0' );
        //MyIO.println(c.length());
            MyIO.println(s);
        }while(isZero(s) == false);
    }
}
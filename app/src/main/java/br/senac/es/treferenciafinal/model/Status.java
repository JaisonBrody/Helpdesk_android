package br.senac.es.treferenciafinal.model;

public enum Status {
    ENVIADA {
        @Override
        public String toString() {
            return "Sended";
        }
    },NAOENVIADA{
        @Override
        public String toString(){
            return "Not Sended";
        }
    },SOLUCAO{
        @Override
        public String toString(){
            return  "Solution";
        }
    }
}

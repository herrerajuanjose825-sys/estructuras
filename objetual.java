public class objetual {
    private String marca;
    private String tipo;
    private int cilindrage;
    private double pagoanterior;
    private double pagoactual;
    private int numerocelda;

            public objetual(String marca, String tipo, int cilindrage, double pagoanterior, double pagoactual,
                    int numerocelda) {
                this.marca = marca;
                this.tipo = tipo;
                this.cilindrage = cilindrage;
                this.pagoanterior = pagoanterior;
                this.pagoactual = pagoactual;
                this.numerocelda = numerocelda; }
                

        public objetual() {
            }


        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        public int getCilindrage() {
            return cilindrage;
        }
        public void setCilindrage(int cilindrage) {
            this.cilindrage = cilindrage;
        }
        public double getPagoanterior() {
            return pagoanterior;
        }
        public void setPagoanterior(double pagoanterior) {
            this.pagoanterior = pagoanterior;
        }
        public double getPagoactual() {
            return pagoactual;
        }
        public void setPagoactual(double pagoactual) {
            this.pagoactual = pagoactual;
        }
        public int getNumerocelda() {
            return numerocelda;
        }
        public void setNumerocelda(int numerocelda) {
            this.numerocelda = numerocelda;
        }


}

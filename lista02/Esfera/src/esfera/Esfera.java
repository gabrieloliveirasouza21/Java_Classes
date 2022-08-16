package esfera;
public class Esfera {
        private float raio = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
        public float  calcVolume(){
           return (float) (4.0/3 * 3.1415 * (Math.pow(raio, 3)));
        }
        
        public float calcArea () {
            
            return(float) (4 * 3.1415 * (Math.pow(raio, 2)));
        }
}

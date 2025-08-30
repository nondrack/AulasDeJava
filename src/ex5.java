public class ex5 {


        // Classe Vetor
        static class Vetor {
            float[] coord;

            Vetor(float x, float y, float z) {
                coord = new float[3];
                coord[0] = x;
                coord[1] = y;
                coord[2] = z;
            }

            // Método escalar (modifica o próprio vetor)
            void escalar(float scalar, int dim) {
                for (int i = 0; i < dim; i++) {
                    coord[i] *= scalar;
                }
            }
        }

        // Método principal
        public static void main(String[] args) {
            Vetor v = new Vetor(10, 10, 0); // centro da janela
            int s = 2;

            v.escalar(s, 2);
            System.out.println(v.coord[0]);
        }
    }



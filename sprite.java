
public class sprite {

        private int x;
        private int y;

        public static void generateGame(int y, int x) {

            // |Generate Background|
            
            // Generate each Y-level
            for(int i = 0; i <= y; i++){ 
                if(i>0) {
                    System.out.println("");

                }
                // For each Y-leve, generate x number of points
                for(int j = 0; j <= x; j++){ 
                    System.out.print("X");
                }
            }

            System.out.println(""); 
        }
    
}
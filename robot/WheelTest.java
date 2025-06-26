package robot;

public class WheelTest {
    public static void main(String[] args) {
        Wheel[] wheels = {new Wheel(4 * 0.0254, "Back Left"),
                            new Wheel(4* 0.0254, "Back Right"),
                            new Wheel(4* 0.0254, "Front Left"),
                            new Wheel(4* 0.0254, "Front Right")};


        for(Wheel w : wheels) {
            double rps = 10.0*Math.random();
            w.setRotationSpeed(rps);
            System.out.println(w.Name() + " rotation speed = " + rps);
        }


        System.out.println("\n=================Linear Speeds=========-=======");
        for(Wheel w : wheels) {
            System.out.println(w.Name() + " linear speed = " + w.getLinearSpeed() + " m/s");
        }


        System.out.println("\nDrive Simulation ");
        for (int i = 0; i < 10; i++) {
            System.out.println("\n=====================Iteration: " + i + "=====================");
            for(Wheel w : wheels) {
                w.addRotation(w.getVelocityInRPS() * 0.3);
                System.out.println(w.Name() + " distance traveled = " + w.getDistanceTraveled() + " m");
               }    
        }
        
    }
}

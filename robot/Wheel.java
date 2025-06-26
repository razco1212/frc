package robot;

public class Wheel {
        private double diameter; 
        private double rotationSpeed;
        private double rotationCount; 
        private String name; 
        private double circumference;

        public Wheel(double diameter, String name) {
            this.diameter = diameter;
            rotationSpeed = 0;
            rotationCount = 0;
            this.name = name;
            circumference = Math.PI * diameter;
        }
        public void setRotationSpeed(double rps) {
        	rotationSpeed = rps;
        }
        public double getLinearSpeed() {
        	return (circumference * rotationSpeed);
        }
		public void addRotation(double r) {
			rotationCount += r;
		}
		public double getDistanceTraveled() {
			return (rotationCount * circumference);
		}
		public void reset() {
			rotationCount = 0;
			rotationSpeed = 0;
		}
		public double getVelocityInRPS() {
			return rotationSpeed;
		}
		public String Name() {
			return name;
		}
		public double getDiameter() {
			return diameter;
		}

 

}

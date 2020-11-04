package fuzzy;

public class Fan {

    private float speed;
    private float acceleration;
    private float timeDelta = 1.0f;

    public Fan(float speed, float timeDelta){
        this.speed = speed;
        this.timeDelta = timeDelta;
    }

    public Fan(float speed){
        this.speed = speed;
        this.acceleration = 0.0f;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public void setTimeDelta(float timeDelta){
        this.timeDelta = timeDelta;
    }

    public float getAngleInTime(float time) {
        return speed * time + acceleration * time * time / 2;
    }

    public void recalculateSpeed(){
        this.speed += this.acceleration * timeDelta;
        if(this.speed < 0) this.speed = 0;
    }
}

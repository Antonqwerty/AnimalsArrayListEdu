class Animal implements Comparable<Animal> {

    private String name;
    private int lifeTime;

    public Animal(String name, int lifeTime) {
        this.name = name;
        this.lifeTime = lifeTime;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public int compareTo(Animal animals) {
        return 0;
    }

    void into() {
        System.out.println("Нажмите 1 чтобы начать");
        System.out.println("Нажмите 2 чтобы посмотреть список");
    }
}
class MuteQuack implements QuackBehaviour {
    @Override
    // Override quack method to define no quacking behavior
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

class Movies {
    public static void main(String[] args) {
        String[] films = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade"};
        String [][] actors = {
            {"Harrison Ford", "Karen Allen", "Paul Freeman"},
            {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
            {"Harrison Ford", "Sean Connery", "Alison Doody"}
        };

        for (int i = 0; i < films.length; i++) {
		System.out.println ("Dans le film " + films[i] + ", les principaux acteurs sont : " + actors[i][0] + ", " + actors[i][1] +  ", " + actors[i][2]);
		}
    }
}
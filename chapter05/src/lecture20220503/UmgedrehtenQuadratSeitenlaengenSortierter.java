package lecture20220503;

public class UmgedrehtenQuadratSeitenlaengenSortierter extends QuadratSeitenlaengenSortierer {
	@Override
	public int compare(Quadrat o1, Quadrat o2) {
		return super.compare(o1, o2) * -1;
	}
}

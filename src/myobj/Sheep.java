package myobj;

public class Sheep {
	// 모든 양에게 동일하게 적용되어야 하는 것 (static)
	static long productCreationTime = 60 * 60 * 8; // 8시간
	static long eggCreationTime = 60 * 60 * 24; // 24시간
	
	// 각 양이 가지고 있어야 하는 것(instance)
	String name = "흰색 양";
	String color = "흰색";
	long lastHarvestTime; // 가장 최근에 양털을 수집한 시간
	long bornTime; // 태어난 시간(획득 시간)
	Sheep mom, dad;
	
	// 이름 수정하기	
	public void setName(String newname) {
		name = newname;
	}
	
	// 털색 수정하기 (먹이 색상에 따라 털 색이 변한다.)
	public void setColor(Food food) {
		this.color = food.color;		
	}
	// 양털 수확하기 (수확 시간을 기록)
	public void harvest() {
		// System.currentTimeMillis(): 현재 시간을 밀리초로 반환하는 함수
		lastHarvestTime = System.currentTimeMillis();
		System.out.println("수확시간: " + lastHarvestTime + "ms");		
	}	
	
	// 남은 시간 알아내기
	public long getRemainHarvestTime() {
		// 남은시간 = 최근수확시간 + 8시간(ms) - 현재시간
		return lastHarvestTime +
				productCreationTime * 1000 - System.currentTimeMillis();
	}
}

package HashMapPractice;

public class Video {
	
	protected String videoTitle, videoGenre, lendName, date;
	protected boolean lend;
	
	
	
	
	// 생성자 함수
	public Video(String videoTitle, String videoGenre, String lendName, String date, boolean lend) {
		super();
		this.videoTitle = videoTitle;
		this.videoGenre = videoGenre;
		this.lendName = lendName;
		this.date = date;
		this.lend = lend;
	}
	
	
	// getter / setter
	
	public String getVideoTitle() {
		return videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}
	public String getVideoGenre() {
		return videoGenre;
	}
	public void setVideoGenre(String videoGenre) {
		this.videoGenre = videoGenre;
	}
	public String getLendName() {
		return lendName;
	}
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isLend() {
		return lend;
	}
	public void setLend(boolean lend) {
		this.lend = lend;
	}


	@Override
	public String toString() {
		
		return "비디오 제목: "+ videoTitle+ ", 장르: "+ videoGenre+ ", 대여여부: "+lend+", 대여자: "+lendName+
				", 대여 날짜: "+ date;
	}
	

	
}

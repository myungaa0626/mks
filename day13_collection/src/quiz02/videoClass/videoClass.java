package quiz02.videoClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class videoClass {

	protected String videoTitle, videoGenre, lendName, lendDate;
	protected boolean lend;
	
	public videoClass(String videoTitle, String videoGenre, boolean lend, String lendName,
			String date) {
		super();
		this.videoTitle = videoTitle;
		this.videoGenre = videoGenre;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = date;
	}
	
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

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	public boolean isLend() {
		return lend;
	}

	public void setLend(boolean lend) {
		this.lend = lend;
	}

	@Override
	public String toString() {

		//return "customer [이름= " + name + ", 주소 = " + address + ", 연락처= "+ phoneNum + "]";
		return "[비디오 제목= "+videoTitle+", 장르= "+videoGenre+
				", 대여여부= "+ lend+", 대여자(고객명)= "+lendName+", 대여일자= "+ lendDate+"]\n";
		
	}

}

package webct2.services;

import java.util.List;

import webct2.dao.VideoDao;
import webct2.dao.IVideoDao;
import webct2.entity.Video;

public class VideoService implements IVideoService{

	IVideoDao vidDao = new VideoDao();

	@Override
	public int count() {
		return vidDao.count();

	}

	@Override
	public List<Video> findAll(int page, int pagesize) {
		return vidDao.findAll(page, pagesize);

	}

	@Override
	public List<Video> findByVidTitle(String title) {
		return vidDao.findByVideotitle(title);

	}

	@Override
	public List<Video> findAll() {
		return vidDao.findAll();

	}

	@Override
	public Video findById(String id) {
		return vidDao.findById(id);

	}

	@Override
	public void delete(String id) throws Exception {
		vidDao.delete(id);
		
	}

	@Override
	public void update(Video video) {
		vidDao.update(video);
		
	}

	@Override
	public void insert(Video video) {
		vidDao.insert(video);
		
	}


}

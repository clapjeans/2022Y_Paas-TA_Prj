package kopo.notice.service.impl;

import kopo.notice.dto.NoticeDTO;
import kopo.notice.persistance.mapper.NoticeMapper;
import kopo.notice.service.INoticeService;
import kopo.notice.service.comm.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NoticeService")
public class NoticeService extends AbstractService implements INoticeService {

	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public List<NoticeDTO> getNoticeList() throws Exception {
		return noticeMapper.getNoticeList();

	}

	@Override
	public void InsertNoticeInfo(NoticeDTO pDTO) throws Exception {
		noticeMapper.InsertNoticeInfo(pDTO);

	}

	@Override
	public NoticeDTO getNoticeInfo(NoticeDTO pDTO) throws Exception {
		return noticeMapper.getNoticeInfo(pDTO);

	}

	@Override
	public void updateNoticeReadCnt(NoticeDTO pDTO) throws Exception {
		noticeMapper.updateNoticeReadCnt(pDTO);

	}

	@Override
	public void updateNoticeInfo(NoticeDTO pDTO) throws Exception {
		noticeMapper.updateNoticeInfo(pDTO);

	}

	@Override
	public void deleteNoticeInfo(NoticeDTO pDTO) throws Exception {
		noticeMapper.deleteNoticeInfo(pDTO);

	}
}

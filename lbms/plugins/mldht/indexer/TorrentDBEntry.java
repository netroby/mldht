package lbms.plugins.mldht.indexer;

import java.util.Date;

import javax.persistence.*;


@Entity(name="ihdata")
public class TorrentDBEntry {
	
	@Id
	String info_hash;
	int status;
	@Column(length=10)
	long added;
	
	
}

package org.pan.domain;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 * Created by xiaopan on 2016-03-01.
 */
@Entity
public class AccountHeaderImage extends AbstractDomain{
    @Lob
    private byte[] headerImage;

    public byte[] getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(byte[] headerImage) {
        this.headerImage = headerImage;
    }
}

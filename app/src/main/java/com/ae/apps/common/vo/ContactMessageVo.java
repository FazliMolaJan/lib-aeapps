/*
 * Copyright 2013 Midhun Harikumar
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ae.apps.common.vo;

import android.graphics.Bitmap;

import com.ae.apps.common.vo.ContactVo;

/**
 * Represents a ContactMessage entity
 * 
 * @author Midhun
 * 
 */
public class ContactMessageVo implements Comparable<ContactMessageVo> {

	private ContactVo			contactVo;
	private int					messageCount;
	transient private Bitmap	photo;

	/**
	 * @return the contactVo
	 */
	public ContactVo getContactVo() {
		return contactVo;
	}

	/**
	 * @param contactVo the contactId to set
	 */
	public void setContactVo(ContactVo contactVo) {
		this.contactVo = contactVo;
	}

	/**
	 * @return the messageCount
	 */
	public int getMessageCount() {
		return messageCount;
	}

	/**
	 * @param messageCount the messageCount to set
	 */
	public void setMessageCount(int messageCount) {
		this.messageCount = messageCount;
	}

	/**
	 *
	 * @return bitmap
	 */
	public Bitmap getPhoto() {
		return photo;
	}

	/**
	 *
	 * @param photo contact photo
	 */
	public void setPhoto(Bitmap photo) {
		this.photo = photo;
	}

	@Override
	public int compareTo(ContactMessageVo o) {
		int retVal = 0;
		if (this.messageCount < o.messageCount) {
			retVal = 1;
		} else if (this.messageCount > o.messageCount) {
			retVal = -1;
		}
		return retVal;
	}

}
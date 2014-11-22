package com.zt.security.model;

// Generated 2011-3-23 11:09:37 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

/**
 * PubResources generated by hbm2java
 */
public class SysResources implements java.io.Serializable {

	private String resourceId;
	private String resourceName;
	private String resourceDesc;
	private String resourceType;
	private String resourceString;
	private Boolean priority;
	
	//�Ƿ���ã�0Ϊ�����ã�1Ϊ���á�
	private Integer enabled;
	
	//�Ƿ��ǳ�����0Ϊ��������1Ϊ������
	private Integer issys;
	
	private String module;
	private Set pubAuthoritiesResourceses = new HashSet(0);

	public SysResources() {
	}

	public SysResources(String resourceId) {
		this.resourceId = resourceId;
	}

	public SysResources(String resourceId, String resourceName,
			String resourceDesc, String resourceType, String resourceString,
			Boolean priority, Integer enabled, Integer issys, String module,
			Set pubAuthoritiesResourceses) {
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.resourceDesc = resourceDesc;
		this.resourceType = resourceType;
		this.resourceString = resourceString;
		this.priority = priority;
		this.enabled = enabled;
		this.issys = issys;
		this.module = module;
		this.pubAuthoritiesResourceses = pubAuthoritiesResourceses;
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceDesc() {
		return this.resourceDesc;
	}

	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceString() {
		return this.resourceString;
	}

	public void setResourceString(String resourceString) {
		this.resourceString = resourceString;
	}

	public Boolean getPriority() {
		return this.priority;
	}

	public void setPriority(Boolean priority) {
		this.priority = priority;
	}

	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Integer getIssys() {
		return this.issys;
	}

	public void setIssys(Integer issys) {
		this.issys = issys;
	}
	
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Set getSysAuthoritiesResourceses() {
		return this.pubAuthoritiesResourceses;
	}

	public void setSysAuthoritiesResourceses(Set pubAuthoritiesResourceses) {
		this.pubAuthoritiesResourceses = pubAuthoritiesResourceses;
	}

}
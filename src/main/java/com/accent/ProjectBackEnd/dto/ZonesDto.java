package com.accent.ProjectBackEnd.dto;
import java.util.Set;
import java.util.List;


public class ZonesDto {
	    private int idZone;
	    private String name;
	    private int tenantId;
	    private String type;
	   private List<InstallationDto> installations;
	   
	 	    

	    public ZonesDto() {}
	    
	    

		public ZonesDto(int idZone, String name, int tenantId, String type, List<InstallationDto> installations) {
			super();
			this.idZone = idZone;
			this.name = name;
			this.tenantId = tenantId;
			this.type = type;
			this.installations = installations;
		}



		public int getIdZone() {
			return idZone;
		}

	


		public void setIdZone(int idZone) {
			this.idZone = idZone;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getTenantId() {
			return tenantId;
		}

		public void setTenantId(int tenantId) {
			this.tenantId = tenantId;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}



	public List<InstallationDto> getInstallations() {
			return installations;
		}



		public void setInstallations(List<InstallationDto> installations) {
			this.installations = installations;
		}
	    
		
	    

	}

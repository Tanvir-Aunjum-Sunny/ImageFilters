package bogdan.imagefilters.effect.filter.instagram;

import bogdan.imagefilters.effect.filter.AbstractFilter;
import bogdan.imagefilters.effect.util.Pixel;


public class NinthenSeventeSeven extends AbstractFilter{
	
	private static final int[][] kRGBMap = {
			{65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,66,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,87,88,89,90,92,93,94,95,97,98,99,100,102,103,105,107,109,111,113,115,117,119,121,123,125,127,129,131,133,133,134,134,135,135,136,136,137,137,138,138,139,139,140,140,141,142,143,144,145,146,148,149,150,151,152,154,155,156,157,158,160,161,162,163,165,166,167,168,170,171,172,173,175,176,177,178,180,181,182,183,184,185,186,187,189,190,191,192,193,194,195,196,198,198,199,200,201,202,203,204,205,205,206,207,208,209,210,211,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,212,213,213,213,213,213,213,213,213,213,213,213,213,213,213,213,213},
			{58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,76,77,78,79,80,81,82,83,85,86,87,88,89,90,91,92,94,95,97,99,100,102,104,105,107,109,110,112,114,115,117,119,121,121,121,122,122,122,123,123,124,124,124,125,125,125,126,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,152,153,154,155,156,157,158,159,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,240,240,240,240,240,240,240,240,240,240,240,240,240,240,240},
			{82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,83,84,85,86,86,87,88,89,89,90,91,92,92,93,94,95,96,97,98,99,100,101,102,104,105,106,107,108,109,110,111,113,114,115,116,117,118,119,120,122,123,124,125,126,127,128,129,131,132,134,136,137,139,141,142,144,146,147,149,151,152,154,156,158,158,158,159,159,159,160,160,161,161,161,162,162,162,163,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,181,182,183,184,185,186,187,188,190,191,192,193,194,195,196,197,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,216,216,217,217,218,218,219,219,220,221,221,222,222,223,223,224,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225,225}
		};
	
	@Override
	public Pixel process(Pixel rgba) {
		
		rgba.setR( kRGBMap[0][rgba.getR()] );
		rgba.setG( kRGBMap[1][rgba.getG()] );
		rgba.setB( kRGBMap[2][rgba.getB()] );
		
		
		return rgba;
	}

}
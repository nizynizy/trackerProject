/**
 * Copyright 2012 Inomera Research
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

package com.netmera.mobile;

import com.netmera.mobile.NetmeraContent;
import com.netmera.mobile.NetmeraClient;
import com.netmera.mobile.NetmeraException;

import android.app.Activity;
import android.os.Bundle;

public class NetmeraMobileStarterActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		
		String API_KEY = "WVhCd1ZYSnNQV2gwZEhBbE0wRWxNa1lsTWtZMk9UTXdNRGc0TXk1dVpYUnRaWEpoTG1OdmJTVXpRVGd3SlRKR2JXOWlhVzFsY21FbE1rWm5ZV1JuWlhRbE1rWjBkWFJ2Y21saGJDNTRiV3dtYm0xVGFYUmxWWEpzUFdoMGRIQWxNMEVsTWtZbE1rWTJPVE13TURnNE15NXVaWFJ0WlhKaExtTnZiU1V6UVRnd0ptMXZaSFZzWlVsa1BUYzFOakFtWVhCd1NXUTlOamt6TURBNE9ETW1ibTFVWlcxd2JHRjBaVDF0YjJKcGRHVnRjR3hoZEdVbWIzZHVaWEpKWkQxdWVtMWpiMjF3YjNObGNpWmtiMjFoYVc0OWJtVjBiV1Z5WVM1amIyMG1ibTFUYVhSbFBUWTVNekF3T0RnekptOTNibVZ5VW05c1pWUjVjR1U5TVNaMmFXVjNaWEpTYjJ4bFZIbHdaVDB4Sm5acFpYZGxja2xrUFc1NmJXTnZiWEJ2YzJWeUpn";
		// NetmeraClient.init(this, API_KEY);

		/*		
		try {
			NetmeraContent content = new NetmeraContent("SampleContent");
			content.add("title", "Content Title");
			content.add("description", "Content Description");
			content.create();
		} catch (NetmeraException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
		}
		*/

		setContentView(R.layout.main);
	}
}

[![Build Status](https://img.shields.io/badge/platform-Android-green)](https://www.android.com/) [![API](https://img.shields.io/badge/API-+23-brightgreen)](https://android-arsenal.com/api?level=23) [![API](https://img.shields.io/badge/license-MIT-blue)]()

<img src="http://ismailhakkiaydin.com/wp-content/uploads/2020/04/logo.png" align="center">

# Content
- [About Projects](https://github.com/ihaydinn/weather-app#about-projects)
  - [Screenshoots](https://github.com/ihaydinn/weather-app#screenshoots)
  - [Abstract](https://github.com/ihaydinn/weather-app#abstract)
  - [Project Details](https://github.com/ihaydinn/weather-app#projects-details)
  - [Library and Tools](https://github.com/ihaydinn/weather-app#library-and-tools)
  - [How Can I Use](https://github.com/ihaydinn/weather-app#how-can-i-use)
- [Architecture](https://github.com/ihaydinn/weather-app#architecture)
- [Design](https://github.com/ihaydinn/weather-app#desing)
- [Support](https://github.com/ihaydinn/weather-app#support)
- [Contact](https://github.com/ihaydinn/weather-app#contact)
- [License](https://github.com/ihaydinn/weather-app#license)

# About Projects
### Screenshots
<img src="http://ismailhakkiaydin.com/wp-content/uploads/2020/04/weather-app-demo.gif" width="156" height="275">    <img src="http://ismailhakkiaydin.com/wp-content/uploads/2020/04/location.png" width="156" height="275">    <img src="http://ismailhakkiaydin.com/wp-content/uploads/2020/04/days.png" width="156" height="275">    <img src="http://ismailhakkiaydin.com/wp-content/uploads/2020/04/nearby.png" width="156" height="275">    <img src="http://ismailhakkiaydin.com/wp-content/uploads/2020/04/nearby_detail.png" width="156" height="275">

### Abstract
 I decided to make the Weather app to use the new technologies of Android and improve myself. When I started doing this application, there were technologies that I used for the first time. This situation forced me a lot. I got involved in continuous research and received help from various question and answer platforms. I would like to thank everyone separately. I am sharing this project with you as open source. If you have a chance to review the code structure, don't forget to send your advice to me. When I finished this project, I learned very good experiences. This made me very happy. Now I started to roll up my sleeves to start my next project.

### Project Details
In this weather application construction, I developed using the APIs offered on OpenWeatherMap, when we log in to the application, we first encounter location permission transactions. When the permit processes are positive, we come to the home page first. Information from the location and weather details are shown to us. When we click the daily weather from the Bottom Bar menu options, the 15-day and 3-hour weather data of our location is available. When we click the other option, the weather information of the nearest cities in our location is available. There is a background feature that changes depending on the day and night situation in your location.

### How Can I Use
If you want to use this project, all you have to do is 
```
/util/Constant/
API_KEY = "Your API KEY"
```
you can follow this path and use the API you obtained from OpenWeatherMap.

### Libraries and tools
 - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
 - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
 - [DataBinding](https://developer.android.com/topic/libraries/data-binding/)
 - [Navigation](https://developer.android.com/guide/navigation/)
 - [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle)
 - [RxJava](https://github.com/ReactiveX/RxJava)
 - [Retrofit](https://square.github.io/retrofit/)
 - [OkHttp](https://square.github.io/okhttp/)
 - [SimpleLocation](https://github.com/delight-im/Android-SimpleLocation)
 - [Glide](https://github.com/bumptech/glide)

# Architecture
 - [MVVM](https://developer.android.com/jetpack/docs/guide)

# Design
I tried to make the design as good as I could for me :) I tried to be inspired by [Freepik](https://www.freepik.com/) and [Flaticon](https://www.flaticon.com/) sites.

# Support
If you want to support, I drink your coffee. :blush: :coffee: 

[<img src="http://ismailhakkiaydin.com/wp-content/uploads/2020/04/patreon.png">](https://www.patreon.com/ihaydinn)

# Contact
- [Blog](http://ismailhakkiaydin.com)
- [Twitter](https://twitter.com/ihaydinn)
- [Linkedin](https://linkedin.com/in/ihaydinn)
- [Medium](https://medium.com/@ihaydinn)
- [About Me](https://about.me/ismailhakkiaydin)

# License
```
Copyright (c) 2020 İsmail Hakkı AYDIN

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be included
in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```

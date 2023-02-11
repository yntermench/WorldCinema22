package com.example.worldcinema1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class ToolBarActivity : AppCompatActivity() {
    lateinit var tb:Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        val video:VideoView=findViewById(R.id.videoView)
        val mediaController=MediaController(this)
        mediaController.setAnchorView(video)
        val onLineurl = Uri.parse("https://rr4---sn-vgqsrnsy.googlevideo.com/videoplayback?expire=1676134405&ei=pXPnY_SOBO6Q_9EPvpWesA4&ip=198.181.163.151&id=o-AOWxmJk2Y8EDZWnVO6JxtzsN-Td9DuY4GdIKcpUJbTUq&itag=18&source=youtube&requiressl=yes&spc=H3gIhh6SGL_qPMxD_HLOUQL7b-DbKn8&vprv=1&mime=video%2Fmp4&ns=11P1A9o4Y0M3cfudQ3gCHW4L&cnr=14&ratebypass=yes&dur=551.775&lmt=1659667947180516&fexp=24007246&c=WEB&txp=6318224&n=Cywzr3O3KQDNVQ&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAJpukA9niNefFkPC1vWXbMF2mc6Ehz5yGKU6wW8MFhdTAiArTmIAT6xCUKoPtwY85RQvfpXIcgLyar3dCcIEPGSdbw%3D%3D&redirect_counter=1&cm2rm=sn-p5qyy76&req_id=cb4441b14e73a3ee&cms_redirect=yes&cmsv=e&mh=0w&mip=188.234.220.77&mm=34&mn=sn-vgqsrnsy&ms=ltu&mt=1676112512&mv=D&mvi=4&pl=0&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgU0BLjIC6XDqaB_JCYPexaUV__qpoiwRYCV3pSfcO8pkCIQC9UW-4jqrxhHqa7gukCuY8qHYLKr2Mq1kw85Atrr0Y1A%3D%3D")
        video.setMediaController(mediaController)
        video.setVideoURI(onLineurl)
        video.requestFocus()
        video.start()

        val video2:VideoView=findViewById(R.id.videoView2)
        val mediaController2=MediaController(this)
        mediaController.setAnchorView(video2)
        val offl = Uri.parse("android.resource://$packageName/${R.raw.klaus2}")
        video2.setMediaController(mediaController2)
        video2.setVideoURI(offl)
        video2.requestFocus()

        tb=findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Кино"

        val frame_res:RecyclerView = findViewById((R.id.rec_view1))
        frame_res.adapter=Frame_adapter(this, FrameList().list)

        val character_res:RecyclerView = findViewById((R.id.rec_view2))
        character_res.adapter=Character_adapter(this, CharacterList().list)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home){
            val inte = Intent(this, Patch::class.java)
            startActivity(inte)
            finish()
        }

        return true
    }
}
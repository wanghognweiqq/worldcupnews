package com.example.administrator.shijeibei.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.shijeibei.Activity.TeamA1Activity;
import com.example.administrator.shijeibei.R;

/**
 * Created by Administrator on 2018/6/6.
 */

public class TeamFragment extends Fragment {
    private String texttitle;
    private String textcontext;
    private Integer imgid;
    private Context mContext;
    private Button a1;
    private Button a2;
    private Button a3;
    private Button a4;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button c1;
    private Button c2;
    private Button c3;
    private Button c4;
    private Button d1;
    private Button d2;
    private Button d3;
    private Button d4;
    private Button e1;
    private Button e2;
    private Button e3;
    private Button e4;
    private Button f1;
    private Button f2;
    private Button f3;
    private Button f4;
    private Button g1;
    private Button g2;
    private Button g3;
    private Button g4;
    private Button h1;
    private Button h2;
    private Button h3;
    private Button h4;

    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_team,container,false);

        getViews(view);
        OnClickListenerImpl listener=new OnClickListenerImpl();
        a1.setOnClickListener(listener);
        a2.setOnClickListener(listener);
        a3.setOnClickListener(listener);
        a4.setOnClickListener(listener);
        b1.setOnClickListener(listener);
        b2.setOnClickListener(listener);
        b3.setOnClickListener(listener);
        b4.setOnClickListener(listener);
        c1.setOnClickListener(listener);
        c2.setOnClickListener(listener);
        c3.setOnClickListener(listener);
        c4.setOnClickListener(listener);
        d1.setOnClickListener(listener);
        d2.setOnClickListener(listener);
        d3.setOnClickListener(listener);
        d4.setOnClickListener(listener);
        e1.setOnClickListener(listener);
        e2.setOnClickListener(listener);
        e3.setOnClickListener(listener);
        e4.setOnClickListener(listener);
        f1.setOnClickListener(listener);
        f2.setOnClickListener(listener);
        f3.setOnClickListener(listener);
        f4.setOnClickListener(listener);
        g1.setOnClickListener(listener);
        g2.setOnClickListener(listener);
        g3.setOnClickListener(listener);
        g4.setOnClickListener(listener);
        h1.setOnClickListener(listener);
        h2.setOnClickListener(listener);
        h3.setOnClickListener(listener);
        h4.setOnClickListener(listener);


        return view;
    }
    private class OnClickListenerImpl implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.a1:
                    Intent intent1=new Intent();
                    intent1.setClass(mContext, TeamA1Activity.class);

                    texttitle = "俄罗斯国家队出征大名单";
                    textcontext ="　　门将：阿金费耶夫(莫斯科中央陆军)、加布洛夫(布鲁日)、鲁涅夫(泽尼特)\n" +
                            "　　后卫：格拉纳特(喀山红宝石)、伊格纳舍维奇(莫斯科中央陆军)、库德里亚绍夫(喀山红宝石)、库捷波夫(莫斯科斯巴达)、塞梅诺夫(格罗兹尼)、斯莫尔尼科夫(泽尼特)、费尔南德斯(莫斯科中央陆军)\n" +
                            "　　中场：加辛斯基(克拉斯诺达尔)、戈洛温(莫斯科中央陆军)、扎戈耶夫(莫斯科中央陆军)、叶罗欣(泽尼特)、日尔科夫(泽尼特)、佐布宁(莫斯科斯巴达)、库兹亚耶夫(泽尼特)、安东-米兰丘克(莫斯科火车头)、萨梅多夫(莫斯科斯巴达)、切里舍夫(比利亚雷亚尔)\n" +
                            "　　前锋：久巴(图拉兵工厂)、阿列克谢-米兰丘克(莫斯科火车头)、斯莫洛夫(克拉斯诺达尔)";
                    imgid = R.mipmap.els;

                    Bundle bundle = new Bundle();// 创建Bundle对象
                    bundle.putString("title", texttitle );//  放入data值为int型
                    intent1.putExtras(bundle);
                    bundle.putString("context", textcontext );
                    intent1.putExtras(bundle);
                    bundle.putInt("imgid", imgid );
                    intent1.putExtras(bundle);// 将Bundle对象放入到Intent上
                    startActivity(intent1);
                    break;
                case R.id.a2:
                    Intent intent2=new Intent();
                    intent2.setClass(mContext, TeamA1Activity.class);

                    texttitle = "沙特阿拉伯国家队出征大名单";
                    textcontext ="　　北京时间6月4日，亚洲劲旅沙特阿拉伯公布了俄罗世界杯23人大名单，效力于西甲莱万特的穆瓦拉德领衔球队。\n" +
                            "　　沙特阿拉伯23人大名单：\n" +
                            "　　门将：穆罕默德-阿洛瓦伊斯（ 阿赫利体育）、阿卜杜拉-阿尔-马约夫（沙特希拉尔）、亚塞尔-莫塞勒姆（阿赫利体育）；\n" +
                            "　　后卫：莫塔兹-豪萨维（阿赫利体育）、奥马尔-豪萨维（ 利雅得胜利）、奥萨马-豪萨维（沙特希拉尔）、亚西尔-沙赫拉尼（ 沙特希拉尔）、曼苏尔-哈尔比（ 阿赫利体育）、穆罕默德-布莱克（沙特希拉尔）、阿里-布莱希（沙特希拉尔）；\n" +
                            "　　中场：阿卜杜勒马莱克-海布里（沙特希拉尔）、侯赛因-阿尔-摩格维（ 阿赫利体育）、阿卜杜拉-海巴里（利雅得青年人）、穆罕默德-卡努（沙特希拉尔）、萨勒曼-法拉杰（沙特希拉尔）、阿卜杜拉-奥泰耶夫（沙特希拉尔）、叶海亚-谢赫里（莱加内斯）、塔希尔-贾希姆（阿赫利体育）、萨利姆-阿尔道萨里（ 沙特希拉尔）、哈坦-巴赫布里（利雅得青年人）；\n" +
                            "　　前锋：穆哈纳德-阿西里（阿赫利体育）、穆罕默德-萨赫拉维（利雅得胜利）、法赫德-穆瓦拉德（莱万特）\n" +
                            "　　（体育）";
                    imgid = R.mipmap.st;

                    Bundle bundle2 = new Bundle();// 创建Bundle对象
                    bundle2.putString("title", texttitle );//  放入data值为int型
                    intent2.putExtras(bundle2);
                    bundle2.putString("context", textcontext );
                    intent2.putExtras(bundle2);
                    bundle2.putInt("imgid", imgid );
                    intent2.putExtras(bundle2);// 将Bundle对象放入到Intent上
                    startActivity(intent2);
                    break;
                case R.id.a3:
                    Intent intent3=new Intent();
                    intent3.setClass(mContext, TeamA1Activity.class);

                    texttitle = "乌拉圭国家队出征大名单";
                    textcontext ="　　北京时间6月2日消息，乌拉圭公布参加世界杯的最终23人名单，苏亚雷斯和卡瓦尼领衔出战。\n" +
                            "　　2018世界杯乌拉圭队最终23人名单详情：\n" +
                            "　　门将：穆斯莱拉(加拉塔萨雷)、马丁-席尔瓦(瓦斯科达伽马)、坎帕尼亚(独立)\n" +
                            "　　后卫：戈丁(马竞)、科茨(葡萄牙体育)、吉梅内斯(马竞)、马克西-佩雷拉(波尔图)、加斯顿-席尔瓦(独立)、马丁-卡塞雷斯(拉齐奥)、吉利尔莫-瓦雷拉(佩纳罗尔)\n" +
                            "　　中场：南德斯(博卡青年)、托雷拉(桑普多利亚)、贝西诺(国米)、本坦库尔(尤文)、卡洛斯-桑切斯(蒙特雷)、德阿拉斯凯塔(克鲁塞罗)、拉克索尔特(热那亚)、克里斯蒂安-罗德里格斯(佩纳罗尔)、乌里塔卡亚(蒙特雷)\n" +
                            "　　前锋：斯图亚尼(赫罗纳)、马克西-戈麦斯(塞尔塔)、卡瓦尼(巴黎圣日耳曼)、苏亚雷斯(巴萨)\n" +
                            "　　世界杯小组赛乌拉圭队比赛时间表\n" +
                            "　　6月15日 19:00 埃及-乌拉圭\n" +
                            "　　6月20日 23:00 乌拉圭-沙特\n" +
                            "　　6月25日 22:00 乌拉圭-俄罗斯";
                    imgid = R.mipmap.wlg;

                    Bundle bundle3 = new Bundle();// 创建Bundle对象
                    bundle3.putString("title", texttitle );//  放入data值为int型
                    intent3.putExtras(bundle3);
                    bundle3.putString("context", textcontext );
                    intent3.putExtras(bundle3);
                    bundle3.putInt("imgid", imgid );
                    intent3.putExtras(bundle3);// 将Bundle对象放入到Intent上
                    startActivity(intent3);
                    break;

                case R.id.a4:
                    Intent intent4=new Intent();
                    intent4.setClass(mContext, TeamA1Activity.class);

                    texttitle = "埃及国家队出征大名单";
                    textcontext ="　　6月4日，埃及国家队公布了俄罗斯世界杯23人最终名单，萨拉赫领衔，埃尔内尼入选\n" +
                            "　　本届世界杯，埃及队分在A组。他们同组的对手是俄罗斯、乌拉圭和沙特。\n" +
                            "\n" +
                            "　　2018世界杯埃及队最终23人大名单：\n" +
                            "　　门将：埃尔哈达里(阿尔塔亚文，沙特)、M-艾尔西纳维(阿尔阿赫利，埃及)、埃克拉米(阿尔阿赫利，埃及)　　后卫：法蒂(阿尔阿赫利，埃及)、萨米尔(阿尔阿赫利，埃及)、阿什拉夫(阿尔阿赫利)、阿布德尔沙菲(阿尔法特，沙特)、赫加齐(西布朗)、阿利-加布尔(西布朗)、埃尔莫哈马迪(阿斯顿维拉)、奥马尔-加布尔(洛杉矶FC)、埃尔文西(扎马雷克，埃及)\n" +
                            "　　中场：埃尔内尼(阿森纳)、哈梅德(扎马雷克，埃及)、希卡巴拉(阿尔拉德，沙特)、埃尔萨伊德(古比斯，芬兰)、摩西(维冈竞技)、卡赫拉比(伊蒂哈德，沙特)、苏卜希(斯托克城)、特雷泽盖(卡斯帕萨，土耳其)、瓦尔达(阿特罗米托斯，希腊)\n" +
                            "　　前锋：萨拉赫(利物浦)、莫赫森(阿尔阿赫利，埃及)";
                    imgid = R.mipmap.aj;

                    Bundle bundle4 = new Bundle();// 创建Bundle对象
                    bundle4.putString("title", texttitle );//  放入data值为int型
                    intent4.putExtras(bundle4);
                    bundle4.putString("context", textcontext );
                    intent4.putExtras(bundle4);
                    bundle4.putInt("imgid", imgid );
                    intent4.putExtras(bundle4);// 将Bundle对象放入到Intent上
                    startActivity(intent4);
                    break;


                case R.id.b1:
                    Intent intentb1=new Intent();
                    intentb1.setClass(mContext, TeamA1Activity.class);

                    texttitle = "葡萄牙国家队出征大名单";
                    textcontext ="　　蔷薇鸿鹄5月28日讯，今日，葡萄牙国家队公布了征战世界杯的23人大名单号码分布，其中头号球星，也是球队队长的C罗身披象征性的7号，而来自中超大连一方的冯特则身披6号战袍。值得一提的是，上街欧洲杯的主力前锋纳尼落选，一起遭弃的还有坎塞洛和塞梅多和戈麦斯。\n" +
                            "　　葡萄牙世界杯最终名单：C罗7号冯特6号，纳尼落选！\n" +
                            "葡萄牙国家队号码具体分布如下：\n" +
                            "　　门将：12-安东尼-洛佩斯（里昂，法甲）、22-贝托（古斯蒂佩，土超）、1-帕特里西奥（葡萄牙体育，葡超）\n" +
                            "　　后卫：2-布鲁诺-阿尔维斯（流浪者，苏超）、21-塞德里克（南安普顿，英超）、6-冯特（大连一方，中超）、19-马里奥-鲁伊（那不勒斯，意甲）、3-佩佩（贝西克塔斯，土超）、5-格雷罗（多特，德甲）、15-里卡多-佩雷拉（波尔图，葡超）、13-鲁本-迪亚斯（本菲卡，葡超）\n" +
                            "　　中场：23-阿德里安-席尔瓦（莱斯特，英超）、16-布鲁诺-费尔南德斯（葡萄牙体育，葡超）、10-若奥-马里奥（西汉姆，英超）、8-穆蒂尼奥（摩纳哥，法甲）、4-曼努埃尔-费尔南德斯（莫斯科火车头，俄超）、14-威廉-卡瓦略（葡萄牙体育，葡萄牙）\n" +
                            "　　前锋：9-安德烈-席尔瓦（AC米兰，意甲）、11-贝尔纳多-席尔瓦（曼城，英超）、7-C罗（皇马，西甲）、18-热松-马丁斯（葡萄牙体育，葡超）、17-格德斯（瓦伦西亚，西甲）、20-夸雷斯马（贝西克塔斯，土超）\n" +
                            "以下是葡萄牙世界杯赛程（北京时间）：\n" +
                            "6月16日2：00 葡萄牙-西班牙\n" +
                            "6月20日20：00 葡萄牙-摩洛哥\n" +
                            "6月26日2：00 伊朗-葡萄牙";
                    imgid = R.mipmap.pty;

                    Bundle bundleb1 = new Bundle();// 创建Bundle对象
                    bundleb1.putString("title", texttitle );//  放入data值为int型
                    intentb1.putExtras(bundleb1);
                    bundleb1.putString("context", textcontext );
                    intentb1.putExtras(bundleb1);
                    bundleb1.putInt("imgid", imgid );
                    intentb1.putExtras(bundleb1);// 将Bundle对象放入到Intent上
                    startActivity(intentb1);
                    break;

                case R.id.b2:
                    Intent intentb2=new Intent();
                    intentb2.setClass(mContext, TeamA1Activity.class);

                    texttitle = "西班牙国家队出征大名单";
                    textcontext ="　　北京时间5月21日消，西班牙国家队公布了参加世界杯的23人名单，切尔西前锋莫拉塔无缘入选。\n" +
                            "　　皇马一共有6名球员进入了名单，巴萨则有4人。在锋线上，洛佩特吉选入了前半个赛季在切尔西无球可踢的迭戈-科斯塔，他重返马竞后表现不俗。同时落选的还有莫拉塔的队友法布雷加斯和阿隆索，以及阿森纳边卫贝莱林。\n" +
                            "　　世界杯上，西班牙和葡萄牙、摩洛哥和伊朗分在同一小组。在世界杯开始前，他们还有和瑞士、突尼斯的两场热身赛。\n" +
                            "　　2018世界杯西班牙队最终23人大名单及球衣号码：\n" +
                            "　　门将：1-德赫亚(曼联)、13-科帕(毕尔巴鄂)、23-雷纳(那不勒斯)\n" +
                            "　　后卫：2-卡瓦哈尔(皇马)、3-皮克(巴萨)、4-纳乔(皇马)、12-奥德里奥索拉(皇家社会)、14-阿斯皮利奎塔(切尔西)、15-拉莫斯(皇马)、16-蒙雷亚尔(阿森纳)、18-阿尔巴(巴萨)\n" +
                            "　　中场：5-布斯克茨(巴萨)、6-伊涅斯塔(巴萨)、7-萨乌尔(马竞)、8-科克(马竞)、10-蒂亚戈(拜仁)、20-阿森西奥(皇马)、21-大卫-席尔瓦(曼城)、22-伊斯科(皇马)\n" +
                            "　　前锋：9-罗德里戈(瓦伦西亚)、11-巴斯克斯(皇马)、17-阿斯帕斯(塞尔塔)、19-迭戈-科斯塔(马竞)";
                    imgid = R.mipmap.xby;

                    Bundle bundleb2 = new Bundle();// 创建Bundle对象
                    bundleb2.putString("title", texttitle );//  放入data值为int型
                    intentb2.putExtras(bundleb2);
                    bundleb2.putString("context", textcontext );
                    intentb2.putExtras(bundleb2);
                    bundleb2.putInt("imgid", imgid );
                    intentb2.putExtras(bundleb2);// 将Bundle对象放入到Intent上
                    startActivity(intentb2);
                    break;

                case R.id.b3:
                    Intent intentb3=new Intent();
                    intentb3.setClass(mContext, TeamA1Activity.class);

                    texttitle = "伊朗国家队出征大名单";
                    textcontext ="　　伊朗足协官方公布了征战2018俄罗斯世界杯的23人名单，“伊朗梅西”阿兹蒙领衔最新球队阵容。世界杯中，伊朗在B组中将面对西班牙、葡萄牙与摩洛哥。\n" +
                            "2018伊朗国家队世界杯23人大名单:\n" +
                            "　　门将：阿里雷扎-贝兰万德（波斯波利斯）、拉希德-马扎赫里（佐布阿汉）、阿米尔-阿贝德扎代（马里迪莫）\n" +
                            "　　后卫：鲁兹贝赫-切什米（德黑兰独立）、莫尔塔扎-普拉利甘吉（阿尔萨德）、雷扎-汉扎德赫（马什哈德）、佩伊曼-蒙塔泽里（德黑兰独立）、马吉德-侯赛尼（德黑兰独立）、拉明-礼萨伊安（奥斯坦德）\n" +
                            "　　中场：梅赫迪-托拉比（塞帕）、伊桑-哈吉萨菲（奥林匹亚科斯）、米拉德-穆罕默迪（格罗兹尼捷列克）、马苏德-绍贾伊（雅典AEK）、奥米德-易卜拉希米（德黑兰独立）、瓦希德-阿米里（波斯波利斯）、萨曼-格多斯（厄斯特松德）、阿什坎-德贾加（诺丁汉森林）\n" +
                            "　　前锋：卡里姆-安萨里（奥林匹亚科斯）、礼萨-古查内贾德（海伦芬）、迈赫迪-塔雷米（加拉法体育）、阿里莱扎-贾汉巴什（阿尔克马尔）、萨达尔-阿兹蒙（喀山红宝石）\n" +
                            "\n";
                    imgid = R.mipmap.yl;

                    Bundle bundleb3 = new Bundle();// 创建Bundle对象
                    bundleb3.putString("title", texttitle );//  放入data值为int型
                    intentb3.putExtras(bundleb3);
                    bundleb3.putString("context", textcontext );
                    intentb3.putExtras(bundleb3);
                    bundleb3.putInt("imgid", imgid );
                    intentb3.putExtras(bundleb3);// 将Bundle对象放入到Intent上
                    startActivity(intentb3);
                    break;

                case R.id.b4:
                    Intent intentb4=new Intent();
                    intentb4.setClass(mContext, TeamA1Activity.class);

                    texttitle = "摩洛哥国家队出征大名单";
                    textcontext ="　　北京时间6月4日，摩洛哥公布了2018世界杯23人最终名单。尤文后卫贝纳蒂亚和皇马后卫阿什拉夫入选摩洛哥国家队世界杯阵容。\n" +
                            "　　摩洛哥被分在B组，世界杯小组赛对手为葡萄牙、西班牙、伊朗。\n" +
                            "　　2018摩洛哥国家队世界杯最新23人大名单：\n" +
                            "　　门将：穆尼尔-默罕默德（努曼西亚、西乙）、亚辛-布努（赫罗纳、西甲）、艾哈迈德-里达（坦吉尔、摩洛哥）\n" +
                            "　　后卫：贝纳蒂亚（尤文、意甲）、罗曼-赛伊斯（狼队、英超）、马努-达科斯塔（伊斯坦布尔、土超）、阿什拉夫（皇马、西甲）、迪拉尔（费内巴切、土超）、哈姆扎（里尔、法甲）\n" +
                            "　　中场：约瑟夫（卡昂、法甲）、马德希（标准列日、比利时）、艾哈迈迪（费耶诺德、荷甲）、尤尼斯（加拉塔萨雷、土超）、哈基姆（阿贾克斯、荷甲）、法吉（赫塔菲、西甲）、菲安-阿姆拉巴特（费耶诺德、荷甲）、布苏法（阿布扎比、阿联酋）、阿米捏（沙尔克04、德甲）\n" +
                            "　　前锋：布哈杜兹（圣保利、德乙）、哈立德（马拉蒂亚体育、土超）、阿尤布（贝尔卡内、摩洛哥）、阿姆拉巴特(莱加内斯、西甲)、恩内斯里(马拉加、西乙)\n" +
                            "摩洛哥主力阵容名单预测：\n" +
                            "　　门将： 穆尼尔\n" +
                            "　　后卫(从左到右)： 阿什拉夫、塞伊斯、贝纳蒂亚、迪拉尔\n" +
                            "　　中场(从左到右)： 布索法、艾哈迈迪、贝尔汉达\n" +
                            "　　前锋(从左到右)：齐耶赫、布塔伊卜、阿姆拉巴特\n" +
                            "　　摩洛哥队在2018年世界杯被分到B组，同组国家队有葡萄牙队、西班牙队、伊朗队。";
                    imgid = R.mipmap.mlg;

                    Bundle bundleb4 = new Bundle();// 创建Bundle对象
                    bundleb4.putString("title", texttitle );//  放入data值为int型
                    intentb4.putExtras(bundleb4);
                    bundleb4.putString("context", textcontext );
                    intentb4.putExtras(bundleb4);
                    bundleb4.putInt("imgid", imgid );
                    intentb4.putExtras(bundleb4);// 将Bundle对象放入到Intent上
                    startActivity(intentb4);
                    break;

                case R.id.c1:
                    Intent intentc1=new Intent();
                    intentc1.setClass(mContext, TeamA1Activity.class);

                    texttitle = "法国国家队出征大名单";
                    textcontext ="　　北京时间5月18日，法国国家队主教练德尚公布了2018年俄罗斯世界杯23人大名单，格列兹曼、姆巴佩、博格巴等巨星悉数入围法国国家队阵容。 \n" +
                            "　　2018世界杯法国国家足球队23人大名单\n" +
                            "2018世界杯法国国家足球队23人大名单\n" +
                            "　　门将：洛里(热刺)，曼丹达(马赛)，阿雷奥拉(巴黎圣日耳曼);\n" +
                            "　　后卫：瓦拉内(皇家马德里)，乌姆蒂蒂(巴塞罗那)，门迪(曼城)，金庞贝(巴黎圣日耳曼)，西迪贝(摩纳哥)，埃尔南德斯(马德里竞技)，拉米(马赛)，帕瓦尔(斯图加特);\n" +
                            "　　中场：博格巴(曼联)，坎特(切尔西)，马图伊迪(尤文图斯)，托利索(拜仁慕尼黑)，恩宗齐(塞维利亚);\n" +
                            "　　前锋：格列兹曼(马德里竞技)，吉鲁(切尔西)，姆巴佩(巴黎圣日耳曼)，登贝莱(巴塞罗那)，费基尔(里昂)，勒马尔(摩纳哥)，托万(马赛)。\n" +
                            "　　候补名单：\n" +
                            "　　本-耶德尔(塞维利亚)，科曼(拜仁慕尼黑)，科斯蒂(波尔多)，德比希(圣埃蒂安)，迪涅(巴塞罗那)，拉卡泽特(阿森纳)，马夏尔(曼联)，拉比奥(巴黎圣日耳曼)，萨科(水晶宫)，西索科(热刺)，祖马(斯托克城)。\n" +
                            "法国国家队首发阵容预测\n" +
                            "      法国国家队首发阵容名单预测（4-2-3-1）：\n" +
                            "      门将：洛里\n" +
                            "      防线（从左至右）：门迪、乌姆蒂蒂、瓦拉内、西迪贝\n" +
                            "      中场（从左至右）：博格巴、坎特\n" +
                            "      前场（从左至右）：姆巴佩、格列兹曼、登贝莱\n" +
                            "      锋线：吉鲁\n" +
                            "      法国队小组赛赛程\n" +
                            "　   6月16日 18:00 法国 - 澳大利亚\n" +
                            "　   6月21日 02:00 法国 - 秘鲁\n" +
                            "　   6月26日 22:00 法国 - 丹麦";
                    imgid = R.mipmap.fg;

                    Bundle bundlec1 = new Bundle();// 创建Bundle对象
                    bundlec1.putString("title", texttitle );//  放入data值为int型
                    intentc1.putExtras(bundlec1);
                    bundlec1.putString("context", textcontext );
                    intentc1.putExtras(bundlec1);
                    bundlec1.putInt("imgid", imgid );
                    intentc1.putExtras(bundlec1);// 将Bundle对象放入到Intent上
                    startActivity(intentc1);
                    break;

                case R.id.c2:
                    Intent intentc2=new Intent();
                    intentc2.setClass(mContext, TeamA1Activity.class);

                    texttitle = "丹麦国家队出征大名单";
                    textcontext ="　　北京时间6月4日凌晨，丹麦足协公布了参加俄罗斯世界杯的23人名单。热刺中场埃里克森领衔，切尔西后卫克里斯滕森、莱斯特门将舒梅切尔等名将都入选，但30岁的国家队多年主力本特纳因伤落选。 \n" +
                            "　　相比之前的27人大名单，主帅哈雷德作出的调整并不多。头号球星、热刺中场司令官埃里克森领衔，除了埃里克森，在英超踢球的舒梅切尔、赞卡、勒斯尔、克里斯滕森也都顺利入选。\n" +
                            "　　本特纳的落选让人意外。30岁的前阿森纳前锋本特纳因为在代表罗森博格的俱乐部比赛中受伤，虽然此前入选了大名单，但最终还是遗憾的因伤落选，无缘俄罗斯世界杯。\n" +
                            "      丹麦队23人名单：\n" +
                            "　　守门员：容诺夫（布隆德比）、勒斯尔（哈德斯菲尔德）、舒梅切尔（莱斯特城）\n" +
                            "　　后卫：克里斯滕森（切尔西）、达尔斯高（布伦特福德）、韦斯特高（门兴格拉德巴赫）、拉尔森（乌迪内斯）、克努德森（伊普斯维奇）、赞卡（哈德斯菲尔德）、凯尔（塞维利亚）\n" +
                            "　　中场：埃里克森（托特纳姆热刺）、舍内（阿贾克斯）、莱拉格（波尔多）、克隆-德利（拉科鲁尼亚）、德拉尼（云达不莱梅）、奎斯特（哥本哈根）\n" +
                            "　　前锋：科内柳斯（亚特兰大）、多尔贝里（阿贾克斯）、布莱特威特（波尔多）、约根森（费耶诺德）、西斯托（塞尔塔维戈）、费舍尔（哥本哈根）、鲍尔森（莱比锡RB）\n" +
                            "       丹麦小组赛赛程 \n" +
                            "　　6月17日 00:00 秘鲁 vs 丹麦\n" +
                            "　　6月21日 20:00 丹麦 vs 澳大利亚\n" +
                            "　　6月26日 22:00 丹麦 vs 法国";
                    imgid = R.mipmap.dm;

                    Bundle bundlec2 = new Bundle();// 创建Bundle对象
                    bundlec2.putString("title", texttitle );//  放入data值为int型
                    intentc2.putExtras(bundlec2);
                    bundlec2.putString("context", textcontext );
                    intentc2.putExtras(bundlec2);
                    bundlec2.putInt("imgid", imgid );
                    intentc2.putExtras(bundlec2);// 将Bundle对象放入到Intent上
                    startActivity(intentc2);
                    break;

                case R.id.c3:
                    Intent intentc3=new Intent();
                    intentc3.setClass(mContext, TeamA1Activity.class);

                    texttitle = "澳大利亚国家队出征大名单";
                    textcontext ="　　 北京时间6月3日，澳大利亚足协公布了出征2018俄罗斯世界杯的23人大名单，卡希尔领衔，耶迪纳克入选最新澳大利亚国家足球队阵容。 \n" +
                            "澳大利亚2018世界杯23人大名单\n" +
                            "　　北京时间6月16日18:00，2018俄罗斯世界杯32强组赛分组结果澳大利亚将首先与同属C组的法国队进行较量，6月21日和26日将分别与丹麦、秘鲁展开交锋。\n" +
                            "      澳大利亚2018世界杯23人大名单：\n" +
                            "　　门将：布拉德-琼斯(费耶诺德)、马修-瑞恩(布莱顿)、武科维奇(亨克)\n" +
                            "　　后卫：塞恩斯伯里(苏黎世草蜢)、尤尔曼(水原三星)、德格内克(横滨水手)、乔西-里斯登(西悉尼流浪者)、比伊奇(布尔萨体育)、梅雷迪思(米尔沃尔)\n" +
                            "　　中场：耶迪纳克(阿斯顿维拉)、穆伊(哈德斯菲尔德)、罗吉奇(凯尔特人)、隆戈(女王公园巡游者)、杰克逊-欧文(赫尔城)、佩特拉托斯(纽卡斯尔喷气机)、米利甘(阿赫利)\n" +
                            "　　前锋：阿尔扎尼(墨尔本城)、蒂姆-卡希尔(米尔沃尔)、尤里奇(卢塞恩)、马修-莱基(柏林赫塔)、纳鲍特(浦和红钻)、克鲁泽(波鸿)、杰米-麦克拉伦（达姆斯塔特）\n" +
                            "      澳大利亚世界杯C组小组赛赛程\n" +
                            "　　6月16日 18:00 法国vs澳大利亚\n" +
                            "　　6月21日 20:00 丹麦vs澳大利亚\n" +
                            "　　6月26日 22:00 澳大利亚vs秘鲁";
                    imgid = R.mipmap.adly;

                    Bundle bundlec3 = new Bundle();// 创建Bundle对象
                    bundlec3.putString("title", texttitle );//  放入data值为int型
                    intentc3.putExtras(bundlec3);
                    bundlec3.putString("context", textcontext );
                    intentc3.putExtras(bundlec3);
                    bundlec3.putInt("imgid", imgid );
                    intentc3.putExtras(bundlec3);// 将Bundle对象放入到Intent上
                    startActivity(intentc3);
                    break;

                case R.id.c4:
                    Intent intentc4=new Intent();
                    intentc4.setClass(mContext, TeamA1Activity.class);

                    texttitle = "秘鲁国家队出征大名单";
                    textcontext ="　　北京时间6月4日，秘鲁公布了征战2018俄罗斯世界杯的23人大名单，队长格雷罗解禁领衔，前德甲名将法尔范入围秘鲁国家队2018世界杯阵容。 \n" +
                            "秘鲁国家队2018世界杯阵容 球队最新23人大名单 \n" +
                            "　　门将：卡塞达（穆尼斯帕尔体育、秘鲁）、卡尔瓦罗（卡哈马卡、秘鲁）、佩德罗-加莱塞（维拉克鲁斯、墨西哥）\n" +
                            "　　后卫：阿德文库拉（罗伯士、墨西哥）、科尔佐（秘鲁大学竞技、秘鲁）、特劳科（弗拉门戈、巴甲）、克里斯蒂安-拉莫斯（维拉克鲁斯、墨西哥）、阿尔伯托-罗德里格斯（水晶体育、秘鲁）、阿劳霍（利马联盟、秘鲁）、桑塔马里亚（普埃布拉、墨西哥）、洛约拉（梅尔加、秘鲁）\n" +
                            "　　中场：佩德罗-阿基诺（罗伯士、墨西哥）、奎瓦（圣保罗、巴西）、弗洛雷斯（奥尔堡、丹麦）、胡塔尔多（吉马良斯、葡超）、塔皮亚（费耶诺德、荷甲）、尤顿 （奥兰多城、美职盟）、卡塔赫纳（维拉克鲁斯、墨西哥）\n" +
                            "　　前锋：格雷罗（弗拉门戈、巴甲）、卡里略（沃特福德、英超）、法尔范（莫斯科火车头、俄超）、鲁迪亚兹（莫雷利亚、墨西哥）、安迪-波洛（波特兰伐木者、美职盟）\n" +
                            "2018世界杯32强全解析:实力衰退 秘鲁难走远\n" +
                            "　　秘鲁主力阵容：\n" +
                            "　　门将：卡塞达\n" +
                            "　　后卫（从左到右）：特朗科、罗德里格斯、拉莫斯、科尔索\n" +
                            "　　中场（从左到右）：尤顿、塔皮亚、奎瓦、弗洛雷斯\n" +
                            "　　前锋（从左到右）：格雷罗、法尔范\n" +
                            "　　本届世界杯，秘鲁队和法国、澳大利亚、丹麦同分在C组\n" +
                            "       秘鲁队小组赛比赛时间表 (北京时间)\n" +
                            "　　6月17日 0:00 秘鲁-丹麦    \n" +
                            "　　6月21日 23:00 秘鲁-法国\n" +
                            "　　6月26日 22:00 秘鲁-澳大利亚";
                    imgid = R.mipmap.bla1;

                    Bundle bundlec4 = new Bundle();// 创建Bundle对象
                    bundlec4.putString("title", texttitle );//  放入data值为int型
                    intentc4.putExtras(bundlec4);
                    bundlec4.putString("context", textcontext );
                    intentc4.putExtras(bundlec4);
                    bundlec4.putInt("imgid", imgid );
                    intentc4.putExtras(bundlec4);// 将Bundle对象放入到Intent上
                    startActivity(intentc4);
                    break;

                case R.id.d1:
                    Intent intentd1=new Intent();
                    intentd1.setClass(mContext, TeamA1Activity.class);

                    texttitle = "冰岛国家队出征大名单";
                    textcontext ="　　北京时间5月11日晚，冰岛足协公布了参加2018俄罗斯世界杯的23人大名单。冰岛公布的大名单中，在英超效力的古德蒙松、西古德森等名将在列，绝大部分球员都在海外联赛效力。\n" +
                            "2018冰岛世界杯国家足球队最新阵容 23人大名单\n" +
                            "　　和其他国家公布的集训大名单不同的是，冰岛直接公布了世界杯最终23人参赛名单。如非伤病情况，这就是最终的出征世界杯的名单。除了大名单外，还有一份12人的替补名单，一旦大名单中的球员出现伤病，将从这其中选择球员征召。\n" +
                            "　　本届世界杯冰岛与阿根廷、尼日利亚和克罗地亚同组。对于两年前的欧洲杯黑马而言，这三个对手都实力强劲。\n" +
                            "        2018冰岛世界杯国家足球队23人大名单：\n" +
                            "　　守门员：哈尔多尔松（兰德斯）、鲁纳尔松（北西兰）、沙拉姆（罗斯基尔德）\n" +
                            "　　后卫：斯库拉松（洛克伦）、马格努松（布里斯托城）、埃约尔夫松（索菲亚列夫斯基）、阿尔纳松（阿伯丁）、因加松（罗斯托夫）、西古德森（罗斯托夫）、弗里奥容松（瓦列伦加）、萨瓦尔松（瓦鲁尔）\n" +
                            "\n" +
                            "　　中场：古德蒙松（伯恩利）、特劳斯塔松（马尔默）、冈纳尔松（加的夫城）、斯库拉松（卡拉布克体育）、西古德森（埃弗顿）、哈尔弗雷德松（乌迪内斯）、巴伊纳尔松（维拉）、吉斯拉松（桑德豪森）\n" +
                            "　　前锋：西古拉尔松（罗斯托夫）、古德蒙德松（埃因霍温）、芬博加松（奥格斯堡）、博德瓦尔松（雷丁）\n" +
                            "　   冰岛候补名单：比耶纳尔松（赫尔辛堡）、芬博加松（霍森斯）、西格索尔松（南特）、卡尔坦松（特拉维夫马卡比）、克里斯廷松（SBV精英）、永松（桑德菲杰）、斯马拉松（哈马比）、奥马尔松（哥德堡）、比亚尔纳松（伊拉兹斯堡）、赫尔曼松（布隆德比）、弗永卢松（北雪平）、西于尔永松（圣加仑）\n" +
                            "       冰岛预测首发阵容（4411）\n" +
                            "　　哈尔多松/A-斯库拉松、R-西于尔兹松、 马格努松、塞瓦尔松/B-比亚尔纳松、A-冈纳松、哈尔弗雷德松、古德蒙德松/G-西于尔兹松/芬博加松\n" +
                            "　　2018俄罗斯世界杯32强球队名单小组赛分组结果阿根廷、冰岛、克罗地亚、尼日利亚同处D组。\n" +
                            "      世界杯冰岛国家队小组赛赛程\n" +
                            "　　6月16日21:00 阿根廷vs冰岛\n" +
                            "　　6月22日23:00 尼日利亚vs冰岛\n" +
                            "　　6月27日02:00 冰岛vs克罗地亚";
                    imgid = R.mipmap.bd;

                    Bundle bundled = new Bundle();// 创建Bundle对象
                    bundled.putString("title", texttitle );//  放入data值为int型
                    intentd1.putExtras(bundled);
                    bundled.putString("context", textcontext );
                    intentd1.putExtras(bundled);
                    bundled.putInt("imgid", imgid );
                    intentd1.putExtras(bundled);// 将Bundle对象放入到Intent上
                    startActivity(intentd1);
                    break;
                case R.id.d2:
                    Intent intentd2=new Intent();
                    intentd2.setClass(mContext, TeamA1Activity.class);

                    texttitle = "克罗地亚国家队出征大名单";
                    textcontext ="　　北京时间6月4日，克罗地亚公布了参加2018世界杯的23人大最终名单，莫德里奇、拉基蒂奇领衔，曼朱基奇、佩里西奇入选克罗地亚国家队阵容。 \n" +
                            "克罗地亚国家队2018世界杯23人大名单\n" +
                            "　　门将：苏巴西奇（摩纳哥、法甲），L-卡利尼奇（根特、比甲），利瓦科维奇（萨格勒布迪纳摩、克甲）\n" +
                            "　　后卫：乔尔卢卡（莫斯科火车头、俄超），维达（贝西克塔斯、土超），斯特里尼奇（桑普多利亚、意甲），洛夫伦（利物浦、英超），福萨里科（马德里竞技、西甲），皮瓦里奇（基辅迪纳摩、乌超），耶德瓦伊（勒沃库森、德甲），巴里西奇（奥西耶克、克甲）\n" +
                            "　　中场：莫德里奇(皇马、西甲），拉基蒂奇（巴萨、西甲），科瓦西奇（皇马、西甲），巴德利（佛罗伦萨、意甲），布罗佐维奇（国米、意甲），布拉达里奇（里耶卡、克甲）\n" +
                            "　　前锋：曼朱基奇（尤文、意甲），佩里西奇（国米、意甲），卡利尼奇（AC米兰、意甲），克拉马里奇（霍芬海姆、德甲），皮亚察（沙尔克、德甲），雷比奇（法兰克福、德甲）\n" +
                            "　　克罗地亚国家队的世界杯首场小组赛将在6月17日开打，尼日利亚、阿根廷、冰岛与克罗地亚被同分一组。\n" +
                            "     克罗地亚世界杯小组赛赛程（北京时间）\n" +
                            "6月17日3：00 克罗地亚-尼日利亚\n" +
                            "6月22日2：00 阿根廷-克罗地亚\n" +
                            "      6月27日2：00 冰岛-克罗地亚";
                    imgid = R.mipmap.kldy;

                    Bundle bundled2 = new Bundle();// 创建Bundle对象
                    bundled2.putString("title", texttitle );//  放入data值为int型
                    intentd2.putExtras(bundled2);
                    bundled2.putString("context", textcontext );
                    intentd2.putExtras(bundled2);
                    bundled2.putInt("imgid", imgid );
                    intentd2.putExtras(bundled2);// 将Bundle对象放入到Intent上
                    startActivity(intentd2);
                    break;
                case R.id.d3:
                    Intent intentd3=new Intent();
                    intentd3.setClass(mContext, TeamA1Activity.class);

                    texttitle = "阿根廷国家队出征大名单";
                    textcontext ="　　北京时间5月22日凌晨，阿根廷足协正式宣布世界杯阿根廷国家队23人大名单。\n" +
                            "阿根廷2018世界杯23人大名单\n" +
                            "　　阿根廷世界杯23人名单阵容：\n" +
                            "　　门将：罗梅罗(曼联)(因伤无缘)、卡巴列罗(切尔西)、阿尔玛尼(河床)、古兹曼(墨西哥老虎队)\n" +
                            "　　后卫：梅尔卡多(塞维利亚)、马斯切拉诺(河北华夏幸福)、奥塔门迪(曼城)、法齐奥(罗马)、罗霍(曼联)、塔利亚菲科(阿贾克斯)、安萨尔迪(热那亚)\n" +
                            "　　中场：兰奇尼(西汉姆联)、比格利亚(AC米兰)、巴内加(塞维利亚)、洛塞尔索(巴黎圣日耳曼)、迪马利亚(巴黎圣日耳曼)、帕文(博卡青年)、萨尔维奥(本菲卡)、阿库尼亚(葡萄牙体育)、梅萨(独立)\n" +
                            "　　前锋：梅西(巴塞罗那)、阿圭罗(曼城)、伊瓜因(尤文图斯)、迪巴拉(尤文图斯)\n" +
                            "　　预计阿根廷首发阵容：(阵型：433)\n" +
                            "　　门将：卡巴列罗\n" +
                            "　　后卫：塔利亚菲科、法齐奥、奥塔门迪、梅尔卡多\n" +
                            "　　中场：马斯切拉诺、比格利亚、巴内加\n" +
                            "　　前锋：迪马利亚、阿圭罗、梅西\n" +
                            "　　D组小组赛同组比赛对手：冰岛、克罗地亚和尼日利亚\n" +
                            "　　阿根廷小组赛赛程(以北京时间为准)》》2018俄罗斯世界杯完整赛程时间\n" +
                            "　　6月16日 21:00 阿根廷 - 冰岛\n" +
                            "　　6月22日 02:00 阿根廷 - 克罗地亚\n" +
                            "　　6月27日 02:00 阿根廷 - 尼日利亚";
                    imgid = R.mipmap.agt;

                    Bundle bundled3 = new Bundle();// 创建Bundle对象
                    bundled3.putString("title", texttitle );//  放入data值为int型
                    intentd3.putExtras(bundled3);
                    bundled3.putString("context", textcontext );
                    intentd3.putExtras(bundled3);
                    bundled3.putInt("imgid", imgid );
                    intentd3.putExtras(bundled3);// 将Bundle对象放入到Intent上
                    startActivity(intentd3);
                    break;

                case R.id.d4:
                    Intent intentd4=new Intent();
                    intentd4.setClass(mContext, TeamA1Activity.class);

                    texttitle = "尼日利亚国家队出征大名单";
                    textcontext ="　　6月4日，埃及国家队公布了俄罗斯世界杯23人最终名单，萨拉赫领衔，埃尔内尼入选\n" +
                            "　　本届世界杯，埃及队分在A组。他们同组的对手是俄罗斯、乌拉圭和沙特。\n" +
                            "\n" +
                            "　　2018世界杯埃及队最终23人大名单：\n" +
                            "　　门将：埃尔哈达里(阿尔塔亚文，沙特)、M-艾尔西纳维(阿尔阿赫利，埃及)、埃克拉米(阿尔阿赫利，埃及)　　后卫：法蒂(阿尔阿赫利，埃及)、萨米尔(阿尔阿赫利，埃及)、阿什拉夫(阿尔阿赫利)、阿布德尔沙菲(阿尔法特，沙特)、赫加齐(西布朗)、阿利-加布尔(西布朗)、埃尔莫哈马迪(阿斯顿维拉)、奥马尔-加布尔(洛杉矶FC)、埃尔文西(扎马雷克，埃及)\n" +
                            "　　中场：埃尔内尼(阿森纳)、哈梅德(扎马雷克，埃及)、希卡巴拉(阿尔拉德，沙特)、埃尔萨伊德(古比斯，芬兰)、摩西(维冈竞技)、卡赫拉比(伊蒂哈德，沙特)、苏卜希(斯托克城)、特雷泽盖(卡斯帕萨，土耳其)、瓦尔达(阿特罗米托斯，希腊)\n" +
                            "　　前锋：萨拉赫(利物浦)、莫赫森(阿尔阿赫利，埃及)";
                    imgid = R.mipmap.nrly;

                    Bundle bundled4 = new Bundle();// 创建Bundle对象
                    bundled4.putString("title", texttitle );//  放入data值为int型
                    intentd4.putExtras(bundled4);
                    bundled4.putString("context", textcontext );
                    intentd4.putExtras(bundled4);
                    bundled4.putInt("imgid", imgid );
                    intentd4.putExtras(bundled4);// 将Bundle对象放入到Intent上
                    startActivity(intentd4);
                    break;

                case R.id.e1:
                    Intent intente1=new Intent();
                    intente1.setClass(mContext, TeamA1Activity.class);

                    texttitle = "塞尔维亚国家队出征大名单";
                    textcontext ="　　北京时间6月2日，塞尔维亚国家队公布了2018世界杯23人大名单，曼联中场大将马蒂奇领衔，中超广州富力后卫托西奇入选塞尔维亚最新国家队阵容。 \n" +
                            "      塞尔维亚2018世界杯23人大名单 最新国家队阵容：\n" +
                            "　　门将：斯托伊科维奇(贝尔格莱德游击)、德米特罗维奇(埃瓦尔)、拉伊科维奇(特拉维夫马卡比)；\n" +
                            "　　后卫：卢卡维纳(比利亚雷亚尔)、科拉罗夫(罗马)、罗迪克(贝尔格莱德红星)、伊万诺维奇(泽尼特)、斯帕吉奇(克拉斯诺达尔)、托西奇(广州富力)、维利科维奇(不莱梅)、米伦科维奇(佛罗伦萨)；\n" +
                            "　　中场：米利沃杰维奇(水晶宫)、马蒂奇(曼联)、格鲁伊奇(利物浦)、利亚伊奇(都灵)、米林科维奇(拉齐奥)、塔迪奇(南安普顿)、科斯蒂奇(汉堡)、日夫科维奇(本菲卡)、拉多尼奇(贝尔格莱德红星)；\n" +
                            "　　前锋：米特罗维奇(纽卡斯尔联)、普利约维奇(塞萨洛尼基)、约维奇(法兰克福)。\n" +
                            "　　本届世界杯，2018俄罗斯世界杯32强分组塞尔维亚分在E组，小组赛对手包括巴西、瑞士和哥斯达黎加。\n" +
                            "      塞尔维亚世界杯赛程\n" +
                            "　　6月17日 20:00 哥斯达黎加vs塞尔维亚\n" +
                            "　　6月23日 02:00 塞尔维亚vs瑞士\n" +
                            "　　6月28日 02:00 塞尔维亚vs巴西\n" +
                            "\n";
                    imgid = R.mipmap.sewy;

                    Bundle bundlee = new Bundle();// 创建Bundle对象
                    bundlee.putString("title", texttitle );//  放入data值为int型
                    intente1.putExtras(bundlee);
                    bundlee.putString("context", textcontext );
                    intente1.putExtras(bundlee);
                    bundlee.putInt("imgid", imgid );
                    intente1.putExtras(bundlee);// 将Bundle对象放入到Intent上
                    startActivity(intente1);
                    break;
                case R.id.e2:
                    Intent intente2=new Intent();
                    intente2.setClass(mContext, TeamA1Activity.class);

                    texttitle = "沙特阿拉伯国家队出征大名单";
                    textcontext ="　　北京时间6月4日，瑞士官方公布了征战俄罗斯世界杯的23人名单，沙奇里、扎卡领衔，利希施泰纳、R罗德里格斯贝赫拉米等名将悉数入选最新国家队球队阵容。 \n" +
                            "　　本届世界杯，瑞士和巴西、塞尔维亚、哥斯达黎加同分E组。\n" +
                            "　　瑞士国家队世界杯23人大名单：\n" +
                            "　　门将：布尔基（多特蒙德、德甲）、姆沃戈（RB莱比锡、德甲）、索默尔（门兴、德甲）\n" +
                            "　　后卫：阿坎吉（多特蒙德、德甲）、朱鲁（安塔利亚体育、土超）、埃尔维迪（门兴、德甲）、迈克尔-朗（巴塞尔、瑞超）、利希施泰纳（尤文图斯、意甲）、穆班杰（图卢兹、法甲）、R-罗德里格斯（AC米兰、意甲）、沙尔（拉科鲁尼亚、西甲）\n" +
                            "　　中前场：贝赫拉米（乌迪内斯、意甲）、德尔米奇（门兴、德甲）、哲马伊利（博洛尼亚、意甲）、恩博洛（沙尔克04、德甲）、G-费尔南德斯（法兰克福、德甲）、弗罗伊勒（亚特兰大、意甲）、加夫兰诺维奇（萨格勒布迪纳摩、克罗地亚）、塞费洛维奇（本菲卡、葡超）、沙奇里（斯托克城、英冠）、扎卡（阿森纳、英超）、扎卡里亚（门兴、德甲）、祖贝尔（霍芬海姆、德甲）\n" +
                            "瑞士国家队主力阵容预测\n" +
                            "　　主力阵容：\n" +
                            "　　门将：索默\n" +
                            "　　后卫（从左到右）：R-罗德里格斯、法比安-舍尔、朱鲁、利希施泰纳\n" +
                            "　　中场（从左到右）：史蒂芬-祖伯、弗罗伊勒、穆罕穆迪、扎卡、沙奇里\n" +
                            "　　前锋（从左到右）：塞费罗维奇";
                    imgid = R.mipmap.rs;

                    Bundle bundlee2 = new Bundle();// 创建Bundle对象
                    bundlee2.putString("title", texttitle );//  放入data值为int型
                    intente2.putExtras(bundlee2);
                    bundlee2.putString("context", textcontext );
                    intente2.putExtras(bundlee2);
                    bundlee2.putInt("imgid", imgid );
                    intente2.putExtras(bundlee2);// 将Bundle对象放入到Intent上
                    startActivity(intente2);
                    break;
                case R.id.e3:
                    Intent intente3=new Intent();
                    intente3.setClass(mContext, TeamA1Activity.class);

                    texttitle = "巴西国家队出征大名单";
                    textcontext ="　　 北京时间5月15日凌晨1点，巴西国家队主教练蒂特公布2018俄罗斯世界杯桑巴军团巴西国家队23人正式名单阵容！内马尔领衔，蒂亚戈-席尔瓦、马塞洛、保利尼奥、卡塞米罗、库蒂尼奥等名将纷纷入选巴西2018世界杯国家足球队阵容。 \n" +
                            "巴西2018世界杯国家队23人名单\n" +
                            "　　门将：1-阿里森（罗马），16-卡西奥（科林蒂安），23-埃德森（曼城）\n" +
                            "　　后卫：2-蒂亚戈-席尔瓦（巴黎圣日耳曼），3-米兰达（国际米兰），4-杰罗梅尔（格雷米奥），6-菲利佩（马竞），12-马塞洛（皇马），13-马基尼奥斯（巴黎圣日耳曼），14-达尼洛（曼城），22-法格纳（科林蒂安）\n" +
                            "　　中场：5-卡塞米罗（皇马），7-道格拉斯-科斯塔（尤文图斯），8-奥古斯托（北京国安），11-库蒂尼奥（巴塞罗那），15-保利尼奥（巴塞罗那），17-费尔南迪尼奥（曼城），18-弗雷德（顿涅茨克矿工），19-威廉（切尔西）\n" +
                            "　　前锋：9-热苏斯（曼城），10-内马尔（巴黎圣日耳曼），20-菲尔米诺（利物浦），21-泰森（顿涅茨克矿工）\n" +
                            "      巴西预计首发阵容名单（433）\n" +
                            "　　阿利森/马塞洛、米兰达、蒂亚戈-席尔瓦、法格纳/卡塞米罗、费尔南迪尼奥、保利尼奥/内马尔、热苏斯、库蒂尼奥\n" +
                            "      世界杯小组赛E组同组比赛对手：瑞士、哥斯达黎加、塞尔维亚\n" +
                            "      世界杯小组赛巴西队比赛时间\n" +
                            "　　6月18日 2:00 巴西-瑞士\n" +
                            "　　6月22日 20:00 巴西-哥斯达黎加\n" +
                            "　　6月28日 2:00 塞尔维亚-巴西\n" ;
                    imgid = R.mipmap.bx;

                    Bundle bundlee3 = new Bundle();// 创建Bundle对象
                    bundlee3.putString("title", texttitle );//  放入data值为int型
                    intente3.putExtras(bundlee3);
                    bundlee3.putString("context", textcontext );
                    intente3.putExtras(bundlee3);
                    bundlee3.putInt("imgid", imgid );
                    intente3.putExtras(bundlee3);// 将Bundle对象放入到Intent上
                    startActivity(intente3);
                    break;

                case R.id.e4:
                    Intent intente4=new Intent();
                    intente4.setClass(mContext, TeamA1Activity.class);

                    texttitle = "哥斯达黎加国家队出征大名单";
                    textcontext ="　　北京时间5月15日凌晨，哥斯达黎加官方公布参加2018世界杯的23人大名单。 \n" +
                            "　　2018哥斯达黎加国家队世界杯23人大名单：\n" +
                            "　　门将：纳瓦斯（皇马），彭伯顿（阿拉胡埃伦塞），莫雷拉（希雷迪亚诺）\n" +
                            "　　后卫：甘博阿（凯尔特人），史密斯（北雪平），马塔里塔（纽约城），奥维耶多（桑德兰），杜阿尔特（西班牙人），冈萨雷斯（博洛尼亚），卡尔沃（明尼苏达联），沃斯顿（温哥华白帽），阿科斯塔（里奥内格罗老鹰）\n" +
                            "　　中场：古兹曼（波特兰伐木工），特赫达（洛桑体育），博尔赫斯（拉科鲁尼亚），阿索费法（希雷迪亚诺），华莱士（纽约城），鲁伊斯（葡萄牙体育），科林德雷斯（萨普里萨体育），博拉诺斯（萨普里萨体育）\n" +
                            "　　前锋：贝内加斯（萨普里萨体育），乔尔-坎贝尔（皇家贝蒂斯），乌雷纳（洛杉矶FC）\n" +
                            "　　本届世界杯，哥斯达黎加分在了E组，同组还有巴西、瑞士饿塞尔维亚等三个对手，也堪称死亡之组\n" +
                            "　　哥斯达黎加小组赛赛程\n" +
                            "　　6月17日 20:00 哥斯达黎加vs塞尔维亚\n" +
                            "　　6月22日 20:00 巴西vs哥斯达黎加\n" +
                            "　　6月28日 02:00 瑞士vs哥斯达黎加";
                    imgid = R.mipmap.gsdlj;

                    Bundle bundlee4 = new Bundle();// 创建Bundle对象
                    bundlee4.putString("title", texttitle );//  放入data值为int型
                    intente4.putExtras(bundlee4);
                    bundlee4.putString("context", textcontext );
                    intente4.putExtras(bundlee4);
                    bundlee4.putInt("imgid", imgid );
                    intente4.putExtras(bundlee4);// 将Bundle对象放入到Intent上
                    startActivity(intente4);
                    break;

                case R.id.f1:
                    Intent intentf1=new Intent();
                    intentf1.setClass(mContext, TeamA1Activity.class);

                    texttitle = "德国国家队出征大名单";
                    textcontext ="　　北京时间6月4日下午，德国足协公布了征战2018俄罗斯世界杯的最终23人大名单。队长诺伊尔伤愈复出，领衔卫冕冠军的最新23人名单，胡梅尔斯、博阿滕、克罗斯、穆勒、厄齐尔等名将也都纷纷在列。多特球星罗伊斯最终入选，踏上个人职业生涯的首次大赛征程。\n" +
                            "       德国队国家队世界杯23人大名单球员号码\n" +
                            "　　守门员：诺伊尔（拜仁）、特尔施特根（巴萨）、特拉普（巴黎）\n" +
                            "　　后卫：博阿滕（拜仁）、金特尔（门兴）、赫克托（科隆）、胡梅尔斯（拜仁）、基米希（拜仁）、普拉特哈特（柏林赫塔）、吕迪格（切尔西）、聚勒（拜仁）\n" +
                            "　　中场/前锋：布兰特（勒沃库森）、德拉克斯勒（巴黎）、格雷茨卡（沙尔克）、京多安（曼城）、赫迪拉（尤文）、克罗斯（皇马）、穆勒（拜仁）、厄齐尔（阿森纳）、罗伊斯（多特）、戈麦斯（斯图加特）、维尔纳（莱比锡）、鲁迪（拜仁）\n" +
                            "　　德国国家队小组赛赛程\n" +
                            "　　6月17日23:00 德国vs墨西哥\n" +
                            "　　6月24日02:00 德国vs瑞典\n" +
                            "　　6月27日22:00 韩国vs德国";
                    imgid = R.mipmap.dg;

                    Bundle bundlef = new Bundle();// 创建Bundle对象
                    bundlef.putString("title", texttitle );//  放入data值为int型
                    intentf1.putExtras(bundlef);
                    bundlef.putString("context", textcontext );
                    intentf1.putExtras(bundlef);
                    bundlef.putInt("imgid", imgid );
                    intentf1.putExtras(bundlef);// 将Bundle对象放入到Intent上
                    startActivity(intentf1);
                    break;
                case R.id.f2:
                    Intent intentf2=new Intent();
                    intentf2.setClass(mContext, TeamA1Activity.class);

                    texttitle = "瑞典家队出征大名单";
                    textcontext ="　　 北京时间5月16日消息，瑞典足协公布了参加2018俄罗斯世界杯的23人名单。 \n" +
                            "　　瑞典国家足球队23大名单阵容：\n" +
                            "　　门将：1-罗宾-奥尔森(哥本哈根)、23-诺德菲尔特(斯旺西)、12-卡尔-约翰-约翰松(甘冈)\n" +
                            "　　后卫：2-卢斯蒂格(凯尔特人)、3-林德洛夫(曼联)、4-格兰奎斯特(克拉斯诺达尔)、5-马丁-奥尔森(斯旺西)、6-奥古斯丁森(不莱梅)、14-赫兰德(博洛尼亚)、16-克拉夫特(博洛尼亚)、18-扬松(利兹)\n" +
                            "　　中场：7-塞巴斯蒂安-拉尔森(赫尔城)、8-埃克达尔(汉堡)、10-福斯贝里(莱比锡)、13-斯文松(西雅图海湾人)、15-希列马克(热那亚)、17-维克多-赫拉森(克拉斯诺达尔)、19-马库斯-罗赫登(克罗托内)、21-杜尔马兹(图卢兹)\n" +
                            "　　前锋：9-马库斯-贝里(阿尔艾因)、11-圭德蒂(阿拉维斯)、20-托伊沃宁(图卢兹)、22-特林(华斯兰比华伦)\n" +
                            "　　瑞典国家足球队球队主帅：扬尼·安德松\n" +
                            "　　瑞典国家队世界排名：\n" +
                            "　　在国际足联4月份公布的世界排名中，瑞典叫上期排名下降四位，暂列世界第23。上个月的两场热身赛：瑞典1-2智利，瑞典0-1罗马尼亚。\n" +
                            "　   瑞典世界杯历史战绩：\n" +
                            "　　瑞典国家队历史上曾11次闯进世界杯决赛圈，最好成绩是在1958年的本土世界杯上获得亚军。当时的瑞典在半决赛中3-1淘汰西德，决赛中2-5不敌贝利领衔的巴西。\n" +
                            "　　2002年世界杯，瑞典队小组赛中战平夺冠热门英格兰、力克非洲雄鹰尼日利亚，遭遇大黑马塞内加尔的阻击，经过加时赛苦战，无缘八强。\n" +
                            "　　瑞典上一次进入32强还要追溯到2006年德国世界杯，南非世界杯预选赛中，瑞典小组第三惨遭淘汰；上届巴西世界杯预选赛，瑞典在附加赛中被C罗率领的葡萄牙拦在门外。\n" +
                            "　　瑞典国家队F组小组赛同组比赛对手：德国、墨西哥和韩国。";
                    imgid = R.mipmap.rd;

                    Bundle bundlef2 = new Bundle();// 创建Bundle对象
                    bundlef2.putString("title", texttitle );//  放入data值为int型
                    intentf2.putExtras(bundlef2);
                    bundlef2.putString("context", textcontext );
                    intentf2.putExtras(bundlef2);
                    bundlef2.putInt("imgid", imgid );
                    intentf2.putExtras(bundlef2);// 将Bundle对象放入到Intent上
                    startActivity(intentf2);
                    break;
                case R.id.f3:
                    Intent intentf3=new Intent();
                    intentf3.setClass(mContext, TeamA1Activity.class);

                    texttitle = "韩国国家队出征大名单";
                    textcontext ="　　北京时间6月2日上午，韩国足协公布了参加2018年世界杯的23人名单。热刺攻击手孙兴慜领衔，效力于广州恒大的金英权则成为韩国队中的中超独苗。\n" +
                            "韩国2018世界杯最新23人大名单 国家足球队阵容 \n" +
                            "　　5月14日时，韩国队曾发布了一份28人初选名单。由于有伤在身，权昶勋、李根镐和金珍洙没能入选23人名单。另外两个落选球员，分别是效力于天津权健的权敬原和效力于水晶宫的李青龙。\n" +
                            "　　门将：金承奎（神户胜利船）、金镇铉（大阪樱花）、赵贤佑（大邱FC）\n" +
                            "　　后卫：金英权（广州恒大）、张贤秀（FC东京）、郑升炫（鸟栖砂岩）、尹荣善（城南FC）、吴反锡（济州联）、洪喆（尚州尚武）、李镕（全北现代）\n" +
                            "　　中场：金敃友（尚州尚武）、朴柱昊（蔚山现代）、高约翰（首尔FC）、奇诚庸（斯旺西城）、郑又荣（神户胜利船）、朱世钟（牙山木槿花）、具滋哲（奥格斯堡）、李在城（全北现代）、文宣民（仁川联FC）\n" +
                            "　　前锋：孙兴慜（热刺）、李升祐（维罗纳）、黄喜灿（萨尔茨堡红牛）、金信煜（全北现代）\n" +
                            "　　本届世界杯中，韩国被分在了F组，同组的对手有德国、墨西哥、瑞典。\n" +
                            "      韩国队世界杯小组赛赛程\n" +
                            "　　6月18日20:00 韩国vs瑞典\n" +
                            "　　6月24日00:00 韩国vs墨西哥\n" +
                            "　　6月27日22:00 韩国vs德国";
                    imgid = R.mipmap.hg1;

                    Bundle bundlef3 = new Bundle();// 创建Bundle对象
                    bundlef3.putString("title", texttitle );//  放入data值为int型
                    intentf3.putExtras(bundlef3);
                    bundlef3.putString("context", textcontext );
                    intentf3.putExtras(bundlef3);
                    bundlef3.putInt("imgid", imgid );
                    intentf3.putExtras(bundlef3);// 将Bundle对象放入到Intent上
                    startActivity(intentf3);
                    break;

                case R.id.f4:
                    Intent intentf4=new Intent();
                    intentf4.setClass(mContext, TeamA1Activity.class);

                    texttitle = "墨西哥国家队出征大名单";
                    textcontext ="　　北京时间6月4日，墨西哥足协公布了出战2018世界杯的23人大名单。“小豌豆”埃尔南德斯领衔，39岁的老将马克斯历史上第五次代表墨西哥队征战世界杯。小将埃里克-古铁雷斯作为唯一后补。 \n" +
                            "墨西哥国家队2018世界杯阵容 最新23人大名单\n" +
                            "　　北京时间6月17日18:00，墨西哥将首先与同属F组的德国展开较量，6月23日21:00/6月27日19:00将分别与韩国、瑞典进行交锋。\n" +
                            "　　门将：热苏斯-科罗纳（蓝十字）、阿尔弗雷多-塔拉韦拉（图卢卡）、奥乔亚（标准列日）\n" +
                            "　　后卫：埃克托-莫雷诺（皇家社会）、阿亚拉（墨西哥老虎）、卡洛斯-萨尔塞多（法兰克福）、拉法埃尔-马克斯（阿特拉斯）、迭戈-雷耶斯（波尔图）、拉云（塞维利亚）、埃德森-阿尔瓦雷斯（美洲队）、加拉尔多（美洲狮）\n" +
                            "　　中场：乔纳森-多斯桑托斯（洛杉矶银河）、马尔科-法比安（法兰克福）、安德雷斯-瓜尔达多（皇家贝蒂斯）、哈维尔-阿基诺（墨西哥老虎）、赫苏斯-科罗纳(波尔图)、埃克托-埃雷拉（波尔图）\n" +
                            "　　前锋：埃尔南德斯（西汉姆联）、劳尔-吉梅内斯（本菲卡）、吉奥瓦尼-多斯-桑托斯（洛杉矶银河）、奥里比-佩拉尔塔（美洲队）、希尔文-洛萨诺（埃因霍温）、卡洛斯-贝拉（洛杉矶FC）\n" +
                            "　　候补：埃里克-古铁雷斯（帕丘卡）\n" +
                            "       墨西哥队世界杯小组赛赛程 \n" +
                            "　　6月17日 德国vs墨西哥\n" +
                            "　　6月23日 韩国vs墨西哥\n" +
                            "　　6月27日 墨西哥vs瑞典\n" +
                            "\n";
                    imgid = R.mipmap.mxg ;

                    Bundle bundlef4 = new Bundle();// 创建Bundle对象
                    bundlef4.putString("title", texttitle );//  放入data值为int型
                    intentf4.putExtras(bundlef4);
                    bundlef4.putString("context", textcontext );
                    intentf4.putExtras(bundlef4);
                    bundlef4.putInt("imgid", imgid );
                    intentf4.putExtras(bundlef4);// 将Bundle对象放入到Intent上
                    startActivity(intentf4);
                    break;

                case R.id.g1:
                    Intent intenth1=new Intent();
                    intenth1.setClass(mContext, TeamA1Activity.class);

                    texttitle = "英格兰国家队出征大名单";
                    textcontext ="　　英格兰代表队公布了世界杯23人大名单号码，斯特林将身披10号，凯恩获得9号。\n" +
                            "\n" +
                            "英格兰23人大名单球衣号码：凯恩9号斯特林10号 埃弗顿门神1号\n" +
                            "具体分配如下：\n" +
                            "门将：1-皮克福德（埃弗顿）、13-巴特兰德（斯托克城）、23-波普（伯恩利）\n" +
                            "后卫：2-沃克（曼城）、5-斯通斯（曼城）、16-菲尔-琼斯（曼联）、12-特里皮尔（热刺）、3-罗斯（热刺）、6-马奎尔（莱斯特城）、22-阿诺德（利物浦）、15-卡希尔（切尔西）\n" +
                            "中场：4-戴尔（热刺）、20-阿里（热刺）、8-亨德森（利物浦）、7-林加德（曼联）、17-德尔夫（曼城）、21-奇克（切尔西）、18-阿什利-扬（曼联）\n" +
                            "前锋：19-拉什福德（曼联）、9-凯恩（热刺）、10-斯特林（曼城）、11-瓦尔迪（莱斯特城）、14-维尔贝克（阿森纳）";
                    imgid = R.mipmap.ygl;

                    Bundle bundleh = new Bundle();// 创建Bundle对象
                    bundleh.putString("title", texttitle );//  放入data值为int型
                    intenth1.putExtras(bundleh);
                    bundleh.putString("context", textcontext );
                    intenth1.putExtras(bundleh);
                    bundleh.putInt("imgid", imgid );
                    intenth1.putExtras(bundleh);// 将Bundle对象放入到Intent上
                    startActivity(intenth1);
                    break;
                case R.id.g2:
                    Intent intentg2=new Intent();
                    intentg2.setClass(mContext, TeamA1Activity.class);

                    texttitle = "比利时国家队出征大名单";
                    textcontext ="　　北京时间6月4日，比利时主帅罗伯托-马丁内斯提交了世界杯23人最终名单，阿扎尔、德布劳内领衔，中超球员维特塞尔&卡拉斯科在列，贾努扎伊在列，本特克无缘，罗马中场纳因戈兰从一开始就无缘欧洲红魔世界杯大名单。\n" +
                            "　　比利时国家队世界杯23人大名单如下：\n" +
                            "　　门将：卡斯蒂尔斯(德甲沃尔夫斯堡)、库尔图瓦(英超切尔西)、米尼奥莱(英超利物浦)\n" +
                            "　　后卫：阿尔德韦雷尔德(英超热刺)、博亚塔(苏超凯尔特人)、孔帕尼(英超曼城)、穆尼耶(法甲PSG)、维尔马伦(西甲巴萨)、维尔通亨(英超热刺)\n" +
                            "　　中场：卡拉斯科(中超大连一方)、查德利(英超西布朗)、登东科尔(比甲安德莱赫特)、德布劳内(英超曼城)、穆萨-登贝莱(英超热刺)、费莱尼(英超曼联)、贾努扎伊(西甲皇家社会)、蒂莱曼斯(法甲摩纳哥)、维特塞尔(中超权健)\n" +
                            "　　前锋：巴舒亚伊(英超切尔西)、阿扎尔(英超切尔西)、索尔根-阿扎尔(德甲门兴)、罗梅鲁-卢卡库(英超曼联)、默滕斯(意甲那不勒斯)\n" +
                            "　　比利时国家队球员号码：比利时国家队世界杯23名球员球衣号码公布\n" +
                            "　　预计首发阵容\n" +
                            "　　门将：库尔图瓦\n" +
                            "　　后卫：维尔通亨、阿尔德韦雷尔德、孔帕尼\n" +
                            "　　中场：费莱尼、德布劳内、穆尼耶、维特塞尔\n" +
                            "　　锋线：默滕斯、阿扎尔、卢卡库\n" +
                            "　　比利时G组小组赛同组比赛对手：英格兰、突尼斯和巴拿马。\n" +
                            "　　比利时世界杯赛程(北京时间)：\n" +
                            "　　6月18日晚上23:00，比利时vs巴拿马\n" +
                            "　　6月23日晚上20:00，比利时vs突尼斯\n" +
                            "　　6月29日凌晨02:00，英格兰vs比利时\n" +
                            "　　比利时国家队世界排名：FIFA排名第5位，最高FIFA排名第1位";
                    imgid = R.mipmap.bls;

                    Bundle bundleg2 = new Bundle();// 创建Bundle对象
                    bundleg2.putString("title", texttitle );//  放入data值为int型
                    intentg2.putExtras(bundleg2);
                    bundleg2.putString("context", textcontext );
                    intentg2.putExtras(bundleg2);
                    bundleg2.putInt("imgid", imgid );
                    intentg2.putExtras(bundleg2);// 将Bundle对象放入到Intent上
                    startActivity(intentg2);
                    break;
                case R.id.g3:
                    Intent intentg3=new Intent();
                    intentg3.setClass(mContext, TeamA1Activity.class);

                    texttitle = "巴拿马国家队出征大名单";
                    textcontext ="　　北京时间5月31日，巴拿马国家队公布了2018世界杯23人正式大名单，多名美职联球员入选，拉科鲁尼亚前锋迪亚斯入围巴拿马最新国家队阵容。\n" +
                            "　　巴拿马国家队2018世界杯23人大名单阵容：\n" +
                            "　　门将：何塞-卡尔德隆(乔里略FC)、艾米-佩内多(布加勒斯特迪纳摩)、阿莱士-罗德里格斯(圣弗朗西斯科FC)\n" +
                            "　　后卫：马切多(休斯顿迪纳摩)、迈克尔-穆里洛(纽约红牛)、费利佩-巴洛伊(CSD市政体育会)、菲德尔-埃斯科巴(纽约红牛)、哈诺德-科明斯(圣何塞地震)、罗曼-托雷斯(西雅图海湾人)、埃里克-戴维斯(多瑙斯特雷达)、路易斯-奥瓦列(奥林匹亚)\n" +
                            "　　中场：加布里埃尔-戈麦斯(布卡拉曼加FC)、阿尼巴尔-戈杜(圣何塞地震)、阿曼多-库铂(智利大学)、阿尔伯特-金特罗(利马大学)、鲁伊斯-罗德里格斯(根特)、瓦伦丁-佩门特尔(阿玛多广场)、巴尔塞纳斯(塔帕丘拉)\n" +
                            "　　前锋：布拉斯-佩雷斯(CSD市政体育会)、路易斯-特哈达(体育生)、加布里埃尔-托雷斯(华奇巴托)、阿比迪埃尔-阿罗约(阿兰胡埃斯)、伊斯梅尔-迪亚斯(拉科鲁尼亚)\n" +
                            "　　本届世界杯，巴拿马被分在了G组，同组的对手有比利时、英格兰和突尼斯。\n" +
                            "　　巴拿马小组赛赛程(北京时间)：\n" +
                            "　　6月18日23:00比利时vs巴拿马\n" +
                            "　　6月24日20:00英格兰vs巴拿马\n" +
                            "　　6月29日2:00巴拿马vs突尼斯\n" +
                            "　　巴拿马世界杯历史战绩\n" +
                            "　　巴拿马FIFA排名：56\n" +
                            "　　世界杯参赛次数：0次\n" +
                            "　　世界杯最好成绩：无\n" +
                            "　　世界杯参赛时间：无\n" +
                            "　　2017年10月10日，巴拿马国家男子足球队以中北美及加勒比地区最终阶段第三，获得2018年俄罗斯世界杯的参赛资格，是第1次参赛。\n" +
                            "　　巴拿马vs英格兰历史战绩\n" +
                            "　　经查询，巴拿马和英格兰在历史上并无交战记录，本次世界杯的小组赛上是首次交锋";
                    imgid = R.mipmap.bnm;

                    Bundle bundleg3 = new Bundle();// 创建Bundle对象
                    bundleg3.putString("title", texttitle );//  放入data值为int型
                    intentg3.putExtras(bundleg3);
                    bundleg3.putString("context", textcontext );
                    intentg3.putExtras(bundleg3);
                    bundleg3.putInt("imgid", imgid );
                    intentg3.putExtras(bundleg3);// 将Bundle对象放入到Intent上
                    startActivity(intentg3);
                    break;

                case R.id.g4:
                    Intent intentg4=new Intent();
                    intentg4.setClass(mContext, TeamA1Activity.class);

                    texttitle = "突尼斯国家队出征大名单";
                    textcontext ="　　北京时间6月2日，在结束与土耳其的热身赛后，突尼斯主帅纳比尔·马卢勒公布了参加俄罗斯世界杯的23人大名单：头号球星优素福·穆萨克尼因伤落选，莫埃齐、哈利勒·卡姆曼、比莱·莫斯尼、卡里姆·拉里比、穆罕默德·瓦埃勒和艾哈迈德·阿凯奇等6名球员，都在最后一刻遭到舍弃。\n" +
                            "　　突尼斯队主教练： 马鲁尔\n" +
                            "　　突尼斯2018世界杯最终23人大名单一览：\n" +
                            "　　门将：穆埃·哈桑(沙托鲁)、艾曼·马特卢蒂(巴廷)、法鲁克·本·穆斯塔法(沙巴布)\n" +
                            "　　后卫：哈姆迪·纳盖(扎马莱克)、迪伦·布龙(根特)、拉米·贝杜(沙希尔之星)、约哈·贝纳卢安(莱斯特城)、沙姆·本·优素福(卡萨姆帕萨)、亚辛·梅里亚(斯法克西恩)、阿里·马卢勒(阿赫利)、乌斯马·哈达迪(第戎)\n" +
                            "　　中场：埃利耶·斯希里(蒙彼利埃)、穆罕默德·阿明·本·阿莫尔(沙希尔之星、盖莱内·沙拉利(突尼斯希望体育)、费贾尼·萨西(纳斯尔)、艾哈迈德·哈利勒(非洲人)、赛义夫-埃丁·哈维(特鲁瓦)、纳伊姆·斯利蒂(第戎)、阿尼斯·巴德里(突尼斯希望体育)、瓦赫比·哈兹里(雷恩)\n" +
                            "　　前锋：法赫尔丁·本·优素福(伊蒂哈德)、巴西姆·斯拉尔菲(尼斯)、萨贝尔·哈利法(非洲人)\n" +
                            "　　2018世界杯突尼斯队比赛赛程\n" +
                            "　　6月19日 2:00 突尼斯-英格兰\n" +
                            "　　6月23日 20:00 比利时-突尼斯\n" +
                            "　　6月29日 2:00 巴拿马-突尼斯";
                    imgid = R.mipmap.tns;

                    Bundle bundleg4 = new Bundle();// 创建Bundle对象
                    bundleg4.putString("title", texttitle );//  放入data值为int型
                    intentg4.putExtras(bundleg4);
                    bundleg4.putString("context", textcontext );
                    intentg4.putExtras(bundleg4);
                    bundleg4.putInt("imgid", imgid );
                    intentg4.putExtras(bundleg4);// 将Bundle对象放入到Intent上
                    startActivity(intentg4);
                    break;

                case R.id.h1:
                    Intent intenthh1=new Intent();
                    intenthh1.setClass(mContext, TeamA1Activity.class);

                    texttitle = "波兰国家队出征大名单";
                    textcontext ="　　北京时间6月4日，波兰足协正式公布了参加世界杯的23人大名单，拜仁前锋莱万多夫斯基无疑是队内名气最响亮的球星。斯泽斯尼、泽林斯基、米利克等名将悉数入选。\n" +
                            "2018世界杯波兰23人大名单\n" +
                            "门将：比亚尔科夫斯基（伊普斯维奇）、法比安斯基（斯旺西）、斯泽斯尼（尤文图斯）；\n" +
                            "后卫：贝德纳雷克（南安普顿）、贝雷辛内斯基（桑普多利亚）、希奥内克（斯帕）、格利克（摩纳哥）、耶德泽齐克（华沙莱吉亚）、帕兹丹（华沙莱吉亚）、皮什切克（多特蒙德）；\n" +
                            "中场：库巴（沃尔夫斯堡）、格拉尔斯基（卢多戈雷茨）、格罗西茨基（赫尔城）、克里乔维亚克（西布朗）、库尔扎瓦（戈尔尼克扎布热）、利内蒂（桑普多利亚）、佩兹科（格但斯克莱吉亚）、里布斯（莫斯科火车头）、泽林斯基（那不勒斯）；\n" +
                            "前锋：考纳茨基（桑普多利亚）、莱万多夫斯基（拜仁慕尼黑）、米利克（那不勒斯）、特奥多切克（安德莱赫特）\n" +
                            "早在5月15日凌晨，波兰足协就曾公布了2018世界杯参赛的35人初选大名单，而最终参加世界杯的23人大名单将从中挑选。本届球员被运往波兰足球历史上的最强“梦之队”，波兰的国家队排名甚至历史性排在第五名。";
                    imgid = R.mipmap.bl;

                    Bundle bundlehh = new Bundle();// 创建Bundle对象
                    bundlehh.putString("title", texttitle );//  放入data值为int型
                    intenthh1.putExtras(bundlehh);
                    bundlehh.putString("context", textcontext );
                    intenthh1.putExtras(bundlehh);
                    bundlehh.putInt("imgid", imgid );
                    intenthh1.putExtras(bundlehh);// 将Bundle对象放入到Intent上
                    startActivity(intenthh1);
                    break;
                case R.id.h2:
                    Intent intenth2=new Intent();
                    intenth2.setClass(mContext, TeamA1Activity.class);

                    texttitle = "日本国家队出征大名单";
                    textcontext ="　　日本足协官网宣布了参加2018俄罗斯世界杯的23人最终名单，之前备受关注的香川真司在列。值得一提的是，这份名单中一共有16名旅欧的海外球员。\n" +
                            "　　日本队2018世界杯23人大名单阵容：\n" +
                            "　　门将：川岛永嗣(梅斯)、东口顺昭(大阪钢巴)、中村航辅(柏太阳神)\n" +
                            "　　后卫：长友佑都(加拉塔萨雷)、槙野智樟(浦和红钻)、吉田麻也(南安普顿)、酒井宏树(马赛)、酒井高德(汉堡)、昌子源(鹿岛鹿角)、远藤航(浦和红钻)、植田直通(鹿岛鹿角)\n" +
                            "　　中场：长谷部诚(法兰克福)、本田圭佑(帕丘卡)、乾贵士(埃瓦尔)、香川真司(多特)、山口萤(大板樱花)、原口元气(杜塞尔多夫)、宇佐美贵史(杜塞尔多夫)、柴崎岳(赫塔菲)、大岛僚太(川崎前锋)、\n" +
                            "　　前锋：冈崎慎司(莱斯特城)、大迫勇也(不莱梅)、武藤嘉纪(美因茨)\n" +
                            "　　与此前日本足协公布的27人名单相比，前锋浅野拓磨与中场球员青山敏弘(伤病)、三竿健斗、井手口阳介四名球员遗憾落选。\n" +
                            "　　本届世界杯，日本被分在H组，他们的同组对手有波兰、塞内加尔、哥伦比亚。他们的首场比赛将在北京时间6月19日20：00对阵哥伦比亚。\n" +
                            "　　H组国家队阵容名单：\n" +
                            "　　2018哥伦比亚国家队世界杯阵容 最新23人大名单\n" +
                            "　　塞内加尔国家队2018世界杯阵容 最新球队23人大名单\n" +
                            "　　波兰国家队2018年世界杯阵容 最新球队23人大名单\n" +
                            "　　小组赛赛程\n" +
                            "　　6月19日 20:00哥伦比亚-日本\n" +
                            "　　6月24日 23:00日本-塞内加尔\n" +
                            "　　6月28日 22:00日本-波兰";
                    imgid = R.mipmap.rb;

                    Bundle bundleh2 = new Bundle();// 创建Bundle对象
                    bundleh2.putString("title", texttitle );//  放入data值为int型
                    intenth2.putExtras(bundleh2);
                    bundleh2.putString("context", textcontext );
                    intenth2.putExtras(bundleh2);
                    bundleh2.putInt("imgid", imgid );
                    intenth2.putExtras(bundleh2);// 将Bundle对象放入到Intent上
                    startActivity(intenth2);
                    break;
                case R.id.h3:
                    Intent intenth3=new Intent();
                    intenth3.setClass(mContext, TeamA1Activity.class);

                    texttitle = "哥伦比亚国家队出征大名单";
                    textcontext ="　　北京时间6月4日，哥伦比亚官方公布了世界杯23人大名单，J罗与法尔考等球星入围，申花队长莫雷诺不幸落选。\n" +
                            "　　哥伦比亚23人大名单：\n" +
                            "　　门将：奥斯皮纳（阿森纳）、卡米洛-巴尔加斯（卡利体育）、费尔南多-夸德拉多（卡尔达斯）\n" +
                            "　　后卫：克里斯蒂安-萨帕塔（AC米兰）、阿里亚斯（埃因霍温）、法布拉（博卡青年）、穆里略（帕丘卡）、米纳（巴萨）、戴文森-桑切斯（热刺）、莫西卡（赫罗纳）、迪亚斯（奥林匹亚）\n" +
                            "　　中场：卡洛斯-桑切斯（佛罗伦萨）、阿圭拉尔（卡利体育）、J罗（拜仁）、金特罗（河床）、维尔马尔-巴里奥斯（曼城）、莱尔马（莱万特）、胡安-夸德拉多（尤文）\n" +
                            "　　前锋：法尔考（摩纳哥）、巴卡（比利亚雷亚尔）、穆里尔（塞维利亚）、博尔哈（帕尔梅拉斯）、伊兹奎尔多（布莱顿）\n" +
                            "　　（新浪体育）";
                    imgid = R.mipmap.glby1;

                    Bundle bundleh3 = new Bundle();// 创建Bundle对象
                    bundleh3.putString("title", texttitle );//  放入data值为int型
                    intenth3.putExtras(bundleh3);
                    bundleh3.putString("context", textcontext );
                    intenth3.putExtras(bundleh3);
                    bundleh3.putInt("imgid", imgid );
                    intenth3.putExtras(bundleh3);// 将Bundle对象放入到Intent上
                    startActivity(intenth3);
                    break;

                case R.id.h4:
                    Intent intenth4=new Intent();
                    intenth4.setClass(mContext, TeamA1Activity.class);

                    texttitle = "塞内加尔家队出征大名单";
                    textcontext ="　　北京时间5月18日，塞内加尔官方公布了出战2018年俄罗斯世界杯的23人大名单。利物浦前锋马内和那不勒斯中卫库利巴利是最大牌的球员。塞内加尔23人基本来自于欧洲联赛，只有门将恩迪亚耶在几内亚踢球。\n" +
                            "2018世界杯塞内加尔23人大名单\n" +
                            "门将：迪亚洛（雷恩、法甲）、戈米斯（斯帕尔、意甲）、恩迪亚耶（自由报竞技、几内亚）\n" +
                            "后卫：库利巴利（那不勒斯、意甲）、卡拉（安德莱赫特、比利时）、加萨玛（阿兰斯亚堡、土超）、瓦奎（欧本、比利时）、萨巴利（波尔多、法甲）、西斯（瓦朗谢纳、法乙）、萨里夫-萨内（汉诺威96、德甲）\n" +
                            "中场：阿里奥尼-恩迪亚耶（斯托克城、英冠）、恩多耶（伯明翰、英冠）、库亚特（西汉姆、英超）、阿尔弗雷德-恩迪亚耶（狼、英冠）、盖耶 （埃弗顿、英超）\n" +
                            "前锋：尼昂（都灵、意甲）、迪亚法拉-萨科（雷恩、法甲）、科内特（亚眠、法甲）、萨尔（雷恩、法甲）、凯塔-巴尔德（摩纳哥、法甲）、迪乌夫（斯托克城、英超）、穆萨-索（布尔萨体育、土超）、马内（利物浦、英超）\n" +
                            "效力于利物浦的边锋马内，是塞内加尔的进攻核心和最强大腿，他在边路的速度和冲击力是塞内加尔最有威胁的进攻手段。本次世预赛马内共出场7次独造7球，其中打进2球助攻5次，成为塞内加尔晋级决赛圈的最大功臣。效力于那不勒斯的铁闸库利巴利也是塞内加尔队中的一大核心，本赛季那不勒斯有着十足的改变，这也与库利巴利在后场兢兢业业的防守息息相关。这位年轻的铁闸也在去年拿到了塞内加尔国内最佳球员。\n" +
                            "塞内加尔球星马内.jpg\n" +
                            "塞内加尔在本届世界杯上被分入了H组，同组的还有波兰、哥伦比亚和日本。本小组中并没有传统豪门球队，任何一支球队出线都是很有可能的。";
                    imgid = R.mipmap.snje;

                    Bundle bundleh4 = new Bundle();// 创建Bundle对象
                    bundleh4.putString("title", texttitle );//  放入data值为int型
                    intenth4.putExtras(bundleh4);
                    bundleh4.putString("context", textcontext );
                    intenth4.putExtras(bundleh4);
                    bundleh4.putInt("imgid", imgid );
                    intenth4.putExtras(bundleh4);// 将Bundle对象放入到Intent上
                    startActivity(intenth4);
                    break;


            }

        }
    }

    private void getViews(View view) {
        a1=view.findViewById(R.id.a1);
        a2=view.findViewById(R.id.a2);
        a3=view.findViewById(R.id.a3);
        a4=view.findViewById(R.id.a4);
        b1=view.findViewById(R.id.b1);
        b2=view.findViewById(R.id.b2);
        b3=view.findViewById(R.id.b3);
        b4=view.findViewById(R.id.b4);
        c1=view.findViewById(R.id.c1);
        c2=view.findViewById(R.id.c2);
        c3=view.findViewById(R.id.c3);
        c4=view.findViewById(R.id.c4);
        d1=view.findViewById(R.id.d1);
        d2=view.findViewById(R.id.d2);
        d3=view.findViewById(R.id.d3);
        d4=view.findViewById(R.id.d4);
        e1=view.findViewById(R.id.e1);
        e2=view.findViewById(R.id.e2);
        e3=view.findViewById(R.id.e3);
        e4=view.findViewById(R.id.e4);
        f1=view.findViewById(R.id.f1);
        f2=view.findViewById(R.id.f2);
        f3=view.findViewById(R.id.f3);
        f4=view.findViewById(R.id.f4);
        g1=view.findViewById(R.id.g1);
        g2=view.findViewById(R.id.g2);
        g3=view.findViewById(R.id.g3);
        g4=view.findViewById(R.id.g4);
        h1=view.findViewById(R.id.h1);
        h2=view.findViewById(R.id.h2);
        h3=view.findViewById(R.id.h3);
        h4=view.findViewById(R.id.h4);


//        ivPhoto = view.findViewById(R.id.iv_photo);
    }

    @Override
    public void onAttach(Context context) {
        this.mContext=context;
        super.onAttach(context);
    }

}

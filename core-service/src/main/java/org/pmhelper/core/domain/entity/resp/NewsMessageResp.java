package org.pmhelper.core.domain.entity.resp;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 新闻消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NewsMessageResp extends BaseMessageResp {
	// 图文消息个数，限制为10条以内
	private int ArticleCount;
	// 多条图文消息信息，默认第一个item为大图
	private List<Article> Articles;

}

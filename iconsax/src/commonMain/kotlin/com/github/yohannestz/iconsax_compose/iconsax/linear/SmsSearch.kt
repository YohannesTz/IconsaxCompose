package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SmsSearch: ImageVector
    get() {
        val current = _smsSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SmsSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 20.5f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -1.5f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.5f, dx2 = 2.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.5f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 9.0f)
                lineToRelative(dx = -3.13f, dy = 2.5f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.75f, dy1 = 0.0f)
                lineTo(x = 7.0f, y = 9.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.2f, y = 21.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.4f)
                moveTo(x = 22.0f, y = 22.0f)
                lineToRelative(dx = -1.0f, dy = -1.0f)
            }
        }.build().also { _smsSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _smsSearch: ImageVector? = null

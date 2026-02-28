package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sms: ImageVector
    get() {
        val current = _sms
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Sms",
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
                moveTo(x = 22.0f, y = 12.98f)
                verticalLineToRelative(dy = 2.52f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.5f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -1.5f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.5f, dx2 = 2.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.5f, dx3 = 5.0f, dy3 = 5.0f)
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
        }.build().also { _sms = it }
    }

@Suppress("ObjectPropertyName")
private var _sms: ImageVector? = null

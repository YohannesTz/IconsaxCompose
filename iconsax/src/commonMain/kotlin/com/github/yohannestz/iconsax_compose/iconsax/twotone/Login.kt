package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Login: ImageVector
    get() {
        val current = _login
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Login",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.68f, y = 14.62f)
                lineToRelative(dx = 2.56f, dy = -2.56f)
                lineToRelative(dx = -2.56f, dy = -2.56f)
                moveTo(x = 4.0f, y = 12.06f)
                horizontalLineToRelative(dx = 10.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 4.0f)
                curveToRelative(dx1 = 4.42f, dy1 = 0.0f, dx2 = 8.0f, dy2 = 3.0f, dx3 = 8.0f, dy3 = 8.0f)
                reflectiveCurveToRelative(dx1 = -3.58f, dy1 = 8.0f, dx2 = -8.0f, dy2 = 8.0f)
            }
        }.build().also { _login = it }
    }

@Suppress("ObjectPropertyName")
private var _login: ImageVector? = null

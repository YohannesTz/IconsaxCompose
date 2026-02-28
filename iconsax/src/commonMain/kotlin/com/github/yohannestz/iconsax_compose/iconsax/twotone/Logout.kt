package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Logout: ImageVector
    get() {
        val current = _logout
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Logout",
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
                moveTo(x = 17.44f, y = 14.62f)
                lineTo(x = 20.0f, y = 12.06f)
                lineTo(x = 17.44f, y = 9.5f)
                moveToRelative(dx = -7.68f, dy = 2.56f)
                horizontalLineToRelative(dx = 10.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.76f, y = 20.0f)
                curveToRelative(dx1 = -4.42f, dy1 = 0.0f, dx2 = -8.0f, dy2 = -3.0f, dx3 = -8.0f, dy3 = -8.0f)
                reflectiveCurveToRelative(dx1 = 3.58f, dy1 = -8.0f, dx2 = 8.0f, dy2 = -8.0f)
            }
        }.build().also { _logout = it }
    }

@Suppress("ObjectPropertyName")
private var _logout: ImageVector? = null

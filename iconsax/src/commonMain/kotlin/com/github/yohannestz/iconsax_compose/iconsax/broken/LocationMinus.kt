package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationMinus: ImageVector
    get() {
        val current = _locationMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LocationMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.25f, y = 11.0f)
                horizontalLineToRelative(dx = 5.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.98f, y = 4.3f)
                curveToRelative(dx1 = 4.37f, dy1 = -4.11f, dx2 = 12.84f, dy2 = -2.7f, dx3 = 14.4f, dy3 = 4.21f)
                curveToRelative(dx1 = 1.15f, dy1 = 5.08f, dx2 = -2.01f, dy2 = 9.38f, dx3 = -4.78f, dy3 = 12.04f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.21f, dy1 = 0.0f)
                curveTo(x1 = 5.63f, y1 = 17.88f, x2 = 2.46f, y2 = 13.58f, x3 = 3.62f, y3 = 8.5f)
            }
        }.build().also { _locationMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _locationMinus: ImageVector? = null

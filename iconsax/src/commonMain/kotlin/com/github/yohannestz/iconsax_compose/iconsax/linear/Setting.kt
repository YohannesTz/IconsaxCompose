package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Setting: ImageVector
    get() {
        val current = _setting
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Setting",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.0f, y = 9.11f)
                verticalLineToRelative(dy = 5.77f)
                curveTo(x1 = 3.0f, y1 = 17.0f, x2 = 3.0f, y2 = 17.0f, x3 = 5.0f, y3 = 18.35f)
                lineToRelative(dx = 5.5f, dy = 3.18f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 0.0f)
                lineToRelative(dx = 5.5f, dy = -3.18f)
                curveToRelative(dx1 = 2.0f, dy1 = -1.35f, dx2 = 2.0f, dy2 = -1.35f, dx3 = 2.0f, dy3 = -3.46f)
                verticalLineTo(y = 9.11f)
                curveTo(x1 = 21.0f, y1 = 7.0f, x2 = 21.0f, y2 = 7.0f, x3 = 19.0f, y3 = 5.65f)
                lineToRelative(dx = -5.5f, dy = -3.18f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 0.0f)
                lineTo(x = 5.0f, y = 5.65f)
                curveTo(x1 = 3.0f, y1 = 7.0f, x2 = 3.0f, y2 = 7.0f, x3 = 3.0f, y3 = 9.11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 15.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
            }
        }.build().also { _setting = it }
    }

@Suppress("ObjectPropertyName")
private var _setting: ImageVector? = null

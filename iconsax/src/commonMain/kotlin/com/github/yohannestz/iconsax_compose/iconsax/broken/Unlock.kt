package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Unlock: ImageVector
    get() {
        val current = _unlock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Unlock",
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
                moveTo(x = 9.5f, y = 16.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = 0.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.5f, dy1 = -2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 17.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = -1.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = 1.0f, dx3 = -5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.0f, dx2 = 1.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 1.76f, dy1 = 0.0f, dx2 = 2.94f, dy2 = -0.19f, dx3 = 3.71f, dy3 = -0.75f)
                moveTo(x = 6.0f, y = 10.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.31f, dx2 = 1.0f, dy2 = -6.0f, dx3 = 6.0f, dy3 = -6.0f)
                curveToRelative(dx1 = 4.5f, dy1 = 0.0f, dx2 = 6.0f, dy2 = 2.0f, dx3 = 6.0f, dy3 = 5.0f)
            }
        }.build().also { _unlock = it }
    }

@Suppress("ObjectPropertyName")
private var _unlock: ImageVector? = null

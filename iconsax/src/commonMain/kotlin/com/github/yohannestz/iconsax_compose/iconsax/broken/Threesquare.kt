package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threesquare: ImageVector
    get() {
        val current = _threesquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Threesquare",
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
                moveTo(x = 12.0f, y = 17.0f)
                verticalLineToRelative(dy = 2.38f)
                curveTo(x1 = 12.0f, y1 = 21.25f, x2 = 11.25f, y2 = 22.0f, x3 = 9.37f, y3 = 22.0f)
                horizontalLineTo(x = 4.62f)
                curveTo(x1 = 2.75f, y1 = 22.0f, x2 = 2.0f, y2 = 21.25f, x3 = 2.0f, y3 = 19.38f)
                verticalLineToRelative(dy = -4.75f)
                curveTo(x1 = 2.0f, y1 = 12.75f, x2 = 2.75f, y2 = 12.0f, x3 = 4.62f, y3 = 12.0f)
                horizontalLineTo(x = 7.0f)
                verticalLineToRelative(dy = 2.37f)
                curveTo(x1 = 7.0f, y1 = 16.25f, x2 = 7.75f, y2 = 17.0f, x3 = 9.62f, y3 = 17.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 12.0f)
                verticalLineToRelative(dy = 2.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.88f, dx2 = -0.75f, dy2 = 2.63f, dx3 = -2.63f, dy3 = 2.63f)
                horizontalLineTo(x = 9.62f)
                curveTo(x1 = 7.75f, y1 = 17.0f, x2 = 7.0f, y2 = 16.25f, x3 = 7.0f, y3 = 14.37f)
                verticalLineTo(y = 9.62f)
                curveTo(x1 = 7.0f, y1 = 7.75f, x2 = 7.75f, y2 = 7.0f, x3 = 9.62f, y3 = 7.0f)
                horizontalLineTo(x = 12.0f)
                verticalLineToRelative(dy = 2.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.88f, dx2 = 0.75f, dy2 = 2.63f, dx3 = 2.62f, dy3 = 2.63f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 9.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.88f, dx2 = -0.75f, dy2 = 2.63f, dx3 = -2.63f, dy3 = 2.63f)
                horizontalLineToRelative(dx = -4.75f)
                curveTo(x1 = 12.75f, y1 = 12.0f, x2 = 12.0f, y2 = 11.25f, x3 = 12.0f, y3 = 9.37f)
                verticalLineTo(y = 4.62f)
                curveTo(x1 = 12.0f, y1 = 2.75f, x2 = 12.75f, y2 = 2.0f, x3 = 14.62f, y3 = 2.0f)
                horizontalLineToRelative(dx = 4.75f)
                curveTo(x1 = 21.25f, y1 = 2.0f, x2 = 22.0f, y2 = 2.75f, x3 = 22.0f, y3 = 4.62f)
            }
        }.build().also { _threesquare = it }
    }

@Suppress("ObjectPropertyName")
private var _threesquare: ImageVector? = null

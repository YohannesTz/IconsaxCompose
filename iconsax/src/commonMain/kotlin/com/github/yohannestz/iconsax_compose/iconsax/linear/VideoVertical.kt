package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoVertical: ImageVector
    get() {
        val current = _videoVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoVertical",
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
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                moveTo(x = 6.89f, y = 2.52f)
                verticalLineToRelative(dy = 18.96f)
                moveToRelative(dx = 10.0f, dy = -18.96f)
                verticalLineToRelative(dy = 18.96f)
                moveToRelative(dx = -10.0f, dy = -14.51f)
                horizontalLineTo(x = 2.54f)
                moveTo(x = 6.89f, y = 12.0f)
                horizontalLineTo(x = 2.03f)
                moveToRelative(dx = 4.86f, dy = 4.97f)
                horizontalLineTo(x = 2.48f)
                moveToRelative(dx = 19.41f, dy = -10.0f)
                horizontalLineToRelative(dx = -4.35f)
                moveTo(x = 21.89f, y = 12.0f)
                horizontalLineToRelative(dx = -4.86f)
                moveToRelative(dx = -0.06f, dy = 0.0f)
                horizontalLineToRelative(dx = -11.0f)
                moveToRelative(dx = 15.92f, dy = 4.97f)
                horizontalLineToRelative(dx = -4.41f)
            }
        }.build().also { _videoVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _videoVertical: ImageVector? = null

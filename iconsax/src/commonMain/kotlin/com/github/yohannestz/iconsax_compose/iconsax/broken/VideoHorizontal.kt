package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoHorizontal: ImageVector
    get() {
        val current = _videoHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoHorizontal",
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
                moveTo(x = 2.0f, y = 12.98f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                moveToRelative(dx = 0.52f, dy = 8.11f)
                horizontalLineToRelative(dx = 18.96f)
                moveToRelative(dx = -18.96f, dy = -10.0f)
                horizontalLineToRelative(dx = 18.96f)
                moveToRelative(dx = -14.51f, dy = 10.0f)
                verticalLineToRelative(dy = 4.35f)
                moveTo(x = 12.0f, y = 17.11f)
                verticalLineToRelative(dy = 4.86f)
                moveToRelative(dx = 4.97f, dy = -4.86f)
                verticalLineToRelative(dy = 4.41f)
                moveToRelative(dx = -10.0f, dy = -19.41f)
                verticalLineToRelative(dy = 4.35f)
                moveTo(x = 12.0f, y = 2.11f)
                verticalLineToRelative(dy = 4.86f)
                moveToRelative(dx = 0.0f, dy = 0.06f)
                verticalLineToRelative(dy = 11.0f)
                moveToRelative(dx = 4.97f, dy = -15.92f)
                verticalLineToRelative(dy = 4.41f)
            }
        }.build().also { _videoHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _videoHorizontal: ImageVector? = null

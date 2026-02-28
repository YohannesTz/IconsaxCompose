package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PauseCircle: ImageVector
    get() {
        val current = _pauseCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PauseCircle",
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
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.75f, y = 14.43f)
                verticalLineTo(y = 9.37f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.48f, dx2 = -0.2f, dy2 = -0.67f, dx3 = -0.71f, dy3 = -0.67f)
                horizontalLineTo(x = 8.75f)
                curveToRelative(dx1 = -0.51f, dy1 = 0.0f, dx2 = -0.71f, dy2 = 0.19f, dx3 = -0.71f, dy3 = 0.67f)
                verticalLineToRelative(dy = 5.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.48f, dx2 = 0.2f, dy2 = 0.67f, dx3 = 0.71f, dy3 = 0.67f)
                horizontalLineToRelative(dx = 1.29f)
                curveToRelative(dx1 = 0.51f, dy1 = 0.0f, dx2 = 0.71f, dy2 = -0.19f, dx3 = 0.71f, dy3 = -0.67f)
                moveToRelative(dx = 5.28f, dy = 0.0f)
                verticalLineTo(y = 9.37f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.48f, dx2 = -0.2f, dy2 = -0.67f, dx3 = -0.71f, dy3 = -0.67f)
                horizontalLineToRelative(dx = -1.29f)
                curveToRelative(dx1 = -0.51f, dy1 = 0.0f, dx2 = -0.71f, dy2 = 0.19f, dx3 = -0.71f, dy3 = 0.67f)
                verticalLineToRelative(dy = 5.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.48f, dx2 = 0.2f, dy2 = 0.67f, dx3 = 0.71f, dy3 = 0.67f)
            }
        }.build().also { _pauseCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _pauseCircle: ImageVector? = null

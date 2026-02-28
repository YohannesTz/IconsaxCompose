package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Award: ImageVector
    get() {
        val current = _award
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Award",
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
                moveTo(x = 18.02f, y = 18.96f)
                curveToRelative(dx1 = 1.72f, dy1 = -1.16f, dx2 = 1.72f, dy2 = -1.16f, dx3 = 1.72f, dy3 = -2.98f)
                verticalLineToRelative(dy = -4.97f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.82f, dx2 = 0.0f, dy2 = -1.82f, dx3 = -1.72f, dy3 = -2.98f)
                lineTo(x = 13.3f, y = 5.3f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.58f, dy1 = 0.0f)
                lineTo(x = 5.98f, y = 8.04f)
                curveTo(x1 = 4.26f, y1 = 9.2f, x2 = 4.26f, y2 = 9.2f, x3 = 4.26f, y3 = 11.02f)
                verticalLineToRelative(dy = 4.97f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.82f, dx2 = 0.0f, dy2 = 1.82f, dx3 = 1.72f, dy3 = 2.98f)
                lineToRelative(dx = 4.73f, dy = 2.73f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.58f, dy1 = 0.0f)
                lineToRelative(dx = 1.52f, dy = -0.88f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.5f, y = 7.63f)
                verticalLineTo(y = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                horizontalLineToRelative(dx = -5.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 2.56f)
                moveToRelative(dx = 5.78f, dy = 8.86f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.55f, dy1 = 0.0f)
                lineToRelative(dx = -0.98f, dy = 0.4f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.23f, dx2 = -1.06f, dy2 = -0.1f, dx3 = -1.02f, dy3 = -0.75f)
                lineToRelative(dx = 0.06f, dy = -1.05f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.17f, dy1 = -0.52f)
                lineToRelative(dx = -0.67f, dy = -0.8f)
                curveToRelative(dx1 = -0.41f, dy1 = -0.5f, dx2 = -0.24f, dy2 = -1.05f, dx3 = 0.39f, dy3 = -1.2f)
                lineToRelative(dx = 1.02f, dy = -0.27f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.44f, dy1 = -0.32f)
                lineToRelative(dx = 0.57f, dy = -0.89f)
                curveToRelative(dx1 = 0.35f, dy1 = -0.55f, dx2 = 0.92f, dy2 = -0.55f, dx3 = 1.27f, dy3 = 0.0f)
                lineToRelative(dx = 0.57f, dy = 0.9f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.44f, dy1 = 0.31f)
                lineToRelative(dx = 1.02f, dy = 0.26f)
                curveToRelative(dx1 = 0.63f, dy1 = 0.16f, dx2 = 0.8f, dy2 = 0.7f, dx3 = 0.39f, dy3 = 1.2f)
                lineToRelative(dx = -0.67f, dy = 0.81f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.17f, dy1 = 0.52f)
            }
        }.build().also { _award = it }
    }

@Suppress("ObjectPropertyName")
private var _award: ImageVector? = null

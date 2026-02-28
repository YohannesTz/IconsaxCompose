package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoOctagon: ImageVector
    get() {
        val current = _videoOctagon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoOctagon",
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
                moveTo(x = 2.92f, y = 8.58f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.12f, dx2 = 0.6f, dy2 = -2.16f, dx3 = 1.57f, dy3 = -2.73f)
                lineToRelative(dx = 5.94f, dy = -3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.15f, dy1 = 0.0f)
                lineToRelative(dx = 5.94f, dy = 3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.57f, dy1 = 2.73f)
                verticalLineToRelative(dy = 6.84f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.12f, dx2 = -0.6f, dy2 = 2.16f, dx3 = -1.57f, dy3 = 2.73f)
                lineToRelative(dx = -5.94f, dy = 3.43f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.15f, dy1 = 0.0f)
                lineTo(x = 4.5f, y = 18.15f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.57f, dy1 = -2.73f)
                verticalLineToRelative(dy = -2.76f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.75f, y = 12.0f)
                verticalLineToRelative(dy = -1.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.54f, dx2 = 1.09f, dy2 = -2.17f, dx3 = 2.42f, dy3 = -1.4f)
                lineToRelative(dx = 1.04f, dy = 0.6f)
                lineToRelative(dx = 1.04f, dy = 0.6f)
                curveToRelative(dx1 = 1.33f, dy1 = 0.77f, dx2 = 1.33f, dy2 = 2.03f, dx3 = 0.0f, dy3 = 2.8f)
                lineTo(x = 13.21f, y = 14.0f)
                lineToRelative(dx = -1.04f, dy = 0.6f)
                curveToRelative(dx1 = -1.33f, dy1 = 0.77f, dx2 = -2.42f, dy2 = 0.14f, dx3 = -2.42f, dy3 = -1.4f)
                close()
            }
        }.build().also { _videoOctagon = it }
    }

@Suppress("ObjectPropertyName")
private var _videoOctagon: ImageVector? = null

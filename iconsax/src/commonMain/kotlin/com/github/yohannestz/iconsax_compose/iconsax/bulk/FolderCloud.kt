package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderCloud: ImageVector
    get() {
        val current = _folderCloud
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderCloud",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.99f, y = 10.84f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.25f, dy1 = -1.4f)
                arcToRelative(a = 5.35f, b = 5.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.1f, dy1 = -3.72f)
                horizontalLineToRelative(dx = -2.78f)
                curveToRelative(dx1 = -0.58f, dy1 = 0.0f, dx2 = -0.62f, dy2 = -0.06f, dx3 = -0.93f, dy3 = -0.47f)
                lineToRelative(dx = -1.4f, dy = -1.86f)
                curveToRelative(dx1 = -0.65f, dy1 = -0.87f, dx2 = -1.16f, dy2 = -1.4f, dx3 = -2.8f, dy3 = -1.4f)
                horizontalLineTo(x = 6.42f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 1.99f, y1 = 6.4f)
                verticalLineToRelative(dy = 10.23f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.95f, dx2 = 2.4f, dy2 = 5.35f, dx3 = 5.35f, dy3 = 5.35f)
                horizontalLineToRelative(dx = 9.3f)
                curveToRelative(dx1 = 2.95f, dy1 = 0.0f, dx2 = 5.35f, dy2 = -2.4f, dx3 = 5.35f, dy3 = -5.35f)
                verticalLineToRelative(dy = -5.8f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.58f, y = 19.7f)
                curveToRelative(dx1 = -2.11f, dy1 = 0.15f, dx2 = -2.11f, dy2 = 3.2f, dx3 = 0.0f, dy3 = 3.36f)
                horizontalLineToRelative(dx = 5.0f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.65f, dy1 = -0.63f)
                curveToRelative(dx1 = 1.48f, dy1 = -1.3f, dx2 = 0.69f, dy2 = -3.9f, dx3 = -1.26f, dy3 = -4.13f)
                curveToRelative(dx1 = -0.7f, dy1 = -4.22f, dx2 = -6.81f, dy2 = -2.62f, dx3 = -5.36f, dy3 = 1.4f)
            }
        }.build().also { _folderCloud = it }
    }

@Suppress("ObjectPropertyName")
private var _folderCloud: ImageVector? = null
